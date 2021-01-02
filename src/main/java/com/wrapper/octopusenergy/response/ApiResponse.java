package com.wrapper.octopusenergy.response;

import com.google.gson.annotations.SerializedName;
import retrofit2.Response;

public class ApiResponse<T> {
    private final Response<T> response;
    @SerializedName("error")
    private ApiError error;

    public ApiResponse(Response<T> response) {
        this.response = response;
    }

    public Response<T> getResponse() {
        return response;
    }

    public boolean isSuccessful() {
        return response != null && this.response.isSuccessful();
    }

    public T body() {
        return response == null ? null : response.body();
    }

    public void setError(ApiError error) {
        this.error = error;
    }
}
