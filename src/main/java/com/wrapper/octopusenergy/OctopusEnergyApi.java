package com.wrapper.octopusenergy;

import java.util.Collections;

import com.wrapper.octopusenergy.request.ProductsRequest;
import com.wrapper.octopusenergy.service.OctopusEnergyApiService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Instances of the OctopusEnergyApi class provides access to the Octopus Energy Web API
 */
public class OctopusEnergyApi {

    public static final String HEADER_CONTENT_TYPE = "Content-Type";

    public static final String CONTENT_TYPE_JSON = "application/json";

    private static final String BASE_URL = "https://api.octopus.energy";

    private Retrofit retrofit;
    private OkHttpClient okHttpClient;

    public OctopusEnergyApi(String apiKey) {
        this(apiKey, BASE_URL);
    }

    OctopusEnergyApi(String apiKey, String baseUrl) {
        setupHttpClient(apiKey, baseUrl);
    }

    private void setupHttpClient(String apiKey, String baseUrl) {
        okHttpClient = new OkHttpClient.Builder()
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

    public ProductsRequest.Builder getProducts() {
        return new ProductsRequest.Builder(this);
    }
}
