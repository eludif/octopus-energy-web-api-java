package com.wrapper.octopusenergy.service;

import com.wrapper.octopusenergy.response.data.OctopusEnergyProduct;
import com.wrapper.octopusenergy.response.data.ProductListData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OctopusEnergyApiService {
    @GET("/v1/products/")
    Call<ProductListData> getProducts(
            @Query("is_variable") String isVariable,
            @Query("is_green") String isGreen,
            @Query("is_tracker") String isTracker,
            @Query("is_prepay") String isPrepay,
            @Query("is_business") String isBusiness,
            @Query("available_at") String availableAt
    );

    @GET("/v1/products/{product_code}/")
    Call<OctopusEnergyProduct> getProduct(@Path("product_code") String productCode,
                                          @Query("tariffs_active_at") String tariffsActiveAt);
}
