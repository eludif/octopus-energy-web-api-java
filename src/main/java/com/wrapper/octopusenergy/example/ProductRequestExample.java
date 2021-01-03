package com.wrapper.octopusenergy.example;

import java.time.LocalDateTime;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.ProductData;

public class ProductRequestExample {
    public static void main(String[] args) {
        // For all requests an API key is needed
        OctopusEnergyApi api = new OctopusEnergyApi("API_KEY");

        // Create and execute a request
        ProductData productsRequest = api.getProducts()
                                         .availableAt(LocalDateTime.now())
                                         .execute();
        System.out.println("productsRequest: " + productsRequest);
    }
}
