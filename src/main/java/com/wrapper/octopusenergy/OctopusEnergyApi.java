package com.wrapper.octopusenergy;

import com.wrapper.octopusenergy.request.ElectricityMeterPointRequest;
import com.wrapper.octopusenergy.request.GridSupplyPointsRequest;
import com.wrapper.octopusenergy.request.MeterConsumptionListRequest;
import com.wrapper.octopusenergy.request.ProductsRequest;
import com.wrapper.octopusenergy.request.RetrieveProductRequest;
import com.wrapper.octopusenergy.request.TariffChargesListRequest;
import com.wrapper.octopusenergy.response.data.EnergyType;
import com.wrapper.octopusenergy.response.data.MeterType;
import com.wrapper.octopusenergy.response.data.RateType;
import com.wrapper.octopusenergy.service.OctopusEnergyApiService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Collections;

/**
 * Instances of the OctopusEnergyApi class provides access to the Octopus Energy Web API
 */
public class OctopusEnergyApi {

    public static final String HEADER_CONTENT_TYPE = "Content-Type";

    public static final String CONTENT_TYPE_JSON = "application/json";

    private static final String BASE_URL = "https://api.octopus.energy";

    private Retrofit retrofit;

    public OctopusEnergyApi(String apiKey) {
        this(apiKey, BASE_URL);
    }

    OctopusEnergyApi(String apiKey, String baseUrl) {
        setupHttpClient(apiKey, baseUrl);
    }

    private void setupHttpClient(String apiKey, String baseUrl) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(new OctopusEnergyInterceptor(apiKey, Collections.emptyMap()))
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    public Retrofit getRetrofitInstance() {
        return retrofit;
    }

    public OctopusEnergyApiService octopusEnergyApiService() {
        return getRetrofitInstance().create(OctopusEnergyApiService.class);
    }

    public ProductsRequest.Builder getProductList() {
        return new ProductsRequest.Builder(this);
    }

    public RetrieveProductRequest.Builder getProduct(String productCode) {
        return new RetrieveProductRequest.Builder(this, productCode);
    }

    public TariffChargesListRequest.Builder getTariffCharges(String productCode, String tariffCode, EnergyType energyType, RateType rateType) {
        return new TariffChargesListRequest.Builder(this, productCode, tariffCode, energyType, rateType);
    }

    public ElectricityMeterPointRequest.Builder getElectricityMeterPoint(String mpan) {
        return new ElectricityMeterPointRequest.Builder(this, mpan);
    }

    public MeterConsumptionListRequest.Builder getMeterConsumption(MeterType meterType, String meterId, String serialNumber) {
        return new MeterConsumptionListRequest.Builder(this, meterType, meterId, serialNumber);
    }

    public GridSupplyPointsRequest.Builder getGridSupplyPoints() {
        return new GridSupplyPointsRequest.Builder(this);
    }
}
