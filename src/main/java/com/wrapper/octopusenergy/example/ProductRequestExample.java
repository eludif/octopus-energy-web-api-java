package com.wrapper.octopusenergy.example;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.ProductData;

public class ProductRequestExample {
    public static void main(String[] args) {
        // For all requests a what3words API key is needed
        OctopusEnergyApi api = new OctopusEnergyApi("API_KEY");

        // Create and execute a request to convert a coordinate to a 3 word address
        ProductData productsRequest = api.getProducts().execute();
        System.out.println("productsRequest: " + productsRequest);
    }
}
