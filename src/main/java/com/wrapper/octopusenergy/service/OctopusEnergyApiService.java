package com.wrapper.octopusenergy.service;

import com.wrapper.octopusenergy.response.data.ProductData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OctopusEnergyApiService {
    @GET("/v1/products/")
    Call<ProductData> getProducts(
            @Query("is_variable") String isVariable,
            @Query("is_green") String isGreen,
            @Query("is_tracker") String isTracker,
            @Query("is_prepay") String isPrepay,
            @Query("is_business") String isBusiness,
            @Query("available_at") String availableAt
    );
}
