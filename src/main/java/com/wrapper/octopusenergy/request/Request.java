package com.wrapper.octopusenergy.request;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.ApiError;
import com.wrapper.octopusenergy.response.ApiResponse;
import com.wrapper.octopusenergy.response.Response;
import retrofit2.Call;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Request<T extends Response<T>> {
    final OctopusEnergyApi octopusEnergyApi;

    Request(OctopusEnergyApi octopusEnergyApi) {
        this.octopusEnergyApi = octopusEnergyApi;
    }

    protected T execute(Call<T> call, Class<T> clazz) {
        ApiResponse<T> response;

        try {
            response = new ApiResponse<>(call.execute());
        } catch (IOException e) {
            e.printStackTrace();
            response = new ApiResponse<>(null);
            ApiError error = new ApiError();
            error.setCode("NetworkError");
            error.setMessage(e.getMessage());
            response.setError(error);
        }

        T entity = response.body();
        if (entity == null) {
            try {
                entity = clazz.getDeclaredConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        if (entity != null) {
            entity.setResponse(response);
        }

        return entity;
    }
}
