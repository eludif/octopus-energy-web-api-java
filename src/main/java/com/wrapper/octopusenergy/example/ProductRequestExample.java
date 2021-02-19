package com.wrapper.octopusenergy.example;

import java.time.LocalDateTime;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.OctopusEnergyProduct;

public class ProductRequestExample {
    public static void main(String[] args) {
        // For all requests an API key is needed
        OctopusEnergyApi api = new OctopusEnergyApi(args[0]);

        // Create and execute a request
        OctopusEnergyProduct product = api.getProduct("PREPAY-VAR-18-09-21")
                                          .tariffsActiveAt(LocalDateTime.now())
                                          .execute();
        System.out.println("productRequest: " + product);
    }
}
