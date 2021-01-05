package com.wrapper.octopusenergy.example;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.EnergyType;
import com.wrapper.octopusenergy.response.data.RateType;
import com.wrapper.octopusenergy.response.data.TariffChargeData;

public class TariffChargeRequestExample {
    public static void main(String[] args) {
        // For all requests an API key is needed
        OctopusEnergyApi api = new OctopusEnergyApi(args[0]);

        // Create and execute a request
        TariffChargeData product = api.getTariffCharges("PREPAY-VAR-18-09-21", "E-1R-PREPAY-VAR-18-09-21-A", EnergyType.ELECTRICITY_TARIFFS, RateType.STANDING_CHARGES)
                                      .execute();
        System.out.println("productRequest: " + product);
    }
}
