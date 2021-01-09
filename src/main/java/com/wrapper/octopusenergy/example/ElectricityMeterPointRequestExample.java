package com.wrapper.octopusenergy.example;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.ElectricityMeterPoint;

public class ElectricityMeterPointRequestExample {
    public static void main(String[] args) {
        // For all requests an API key is needed
        OctopusEnergyApi api = new OctopusEnergyApi(args[0]);

        // Create and execute a request
        ElectricityMeterPoint electricityMeterPoint = api.getElectricityMeterPoint(
                "mpan").execute();
        System.out.println("electricityMeterPoint: " + electricityMeterPoint);
    }
}
