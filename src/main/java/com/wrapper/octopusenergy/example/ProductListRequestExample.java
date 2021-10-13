package com.wrapper.octopusenergy.example;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.ProductListData;

import java.time.LocalDateTime;

public class ProductListRequestExample {
    public static void main(String[] args) {
        // For all requests an API key is needed
        OctopusEnergyApi api = new OctopusEnergyApi(args[0]);

        // Create and execute a request
        ProductListData productsRequest = api.getProductList()
                                             .availableAt(LocalDateTime.now())
                                             .execute();
        System.out.println("productsRequest: " + productsRequest);
    }
}
