package com.wrapper.octopusenergy.service;

import com.wrapper.octopusenergy.response.data.ElectricityMeterPoint;
import com.wrapper.octopusenergy.response.data.MeterConsumption;
import com.wrapper.octopusenergy.response.data.OctopusEnergyProduct;
import com.wrapper.octopusenergy.response.data.ProductListData;
import com.wrapper.octopusenergy.response.data.TariffChargeData;
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
    Call<OctopusEnergyProduct> getProduct(
            @Path("product_code") String productCode,
            @Query("tariffs_active_at") String tariffsActiveAt
    );

    @GET("/v1/products/{product_code}/{energy_type}/{tariff_code}/{rate_type}/")
    Call<TariffChargeData> getTariffCharges(
            @Path("product_code") String productCode,
            @Path("tariff_code") String tariffCode,
            @Path("energy_type") String energyType,
            @Path("rate_type") String rateType,
            @Query("period_from") String periodFrom,
            @Query("period_to") String periodTo,
            @Query("page_size") String pageSize
    );

    @GET("/v1/electricity-meter-points/{mpan}/")
    Call<ElectricityMeterPoint> getElectricityMeterPoint(
            @Path("mpan") String mpan
    );

    @GET("/v1/{meter_point_type}/{meter_id}/meters/{serial_number}/consumption/")
    Call<MeterConsumption> getMeterConsumption(
            @Path("meter_point_type") String meterPointType,
            @Path("meter_id") String meterId,
            @Path("serial_number") String serialNumber,
            @Query("period_from") String periodFrom,
            @Query("period_to") String periodTo,
            @Query("page_size") String pageSize,
            @Query("order_by") String orderBy,
            @Query("group_by") String groupBy
    );
}
