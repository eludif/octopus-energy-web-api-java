package com.wrapper.octopusenergy;

import java.io.IOException;
import java.util.Map;

import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import static com.wrapper.octopusenergy.OctopusEnergyApi.CONTENT_TYPE_JSON;
import static com.wrapper.octopusenergy.OctopusEnergyApi.HEADER_CONTENT_TYPE;

public class OctopusEnergyInterceptor implements Interceptor {

    private final String credentials;
    private final Map<String, String> headers;

    public OctopusEnergyInterceptor(String apiKey, Map<String, String> headers) {
        this.credentials = Credentials.basic(apiKey, ":");
        this.headers = headers;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        Request.Builder builder = request.newBuilder();

        builder.header(HEADER_CONTENT_TYPE, CONTENT_TYPE_JSON);
        builder.header("Authorization", credentials);

        // add any custom headers
        if (headers != null) {
            for (String name : headers.keySet()) {
                String value = headers.get(name);
                builder.header(name, value);
            }
        }

        return chain.proceed(builder.build());
    }
}
