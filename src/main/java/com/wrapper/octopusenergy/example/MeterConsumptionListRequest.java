package com.wrapper.octopusenergy.example;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.MeterConsumption;
import com.wrapper.octopusenergy.response.data.MeterConsumptionList;
import com.wrapper.octopusenergy.response.data.MeterType;

public class MeterConsumptionListRequest {
    public static void main(String[] args) {
        // For all requests an API key is needed
        OctopusEnergyApi api = new OctopusEnergyApi(args[0]);

        // Create and execute a request
        MeterConsumptionList meterConsumptionList = api.getMeterConsumption(
                MeterType.ELECTRICITY
                , "meterId"
                , "serialNumber"
        ).execute();
        System.out.println("meterConsumptionList: " + meterConsumptionList);
    }
}
