package com.wrapper.octopusenergy.example;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.GridSupplyPointsData;

public class GridSupplyPointsRequestExample {
    public static void main(String[] args) {
        // For all requests an API key is needed
        OctopusEnergyApi api = new OctopusEnergyApi(args[0]);

        // Create and execute a request
        GridSupplyPointsData gridSupplyPoints = api.getGridSupplyPoints().postCode("EC1").execute();
        System.out.println("meterConsumption: " + gridSupplyPoints);
    }
}
