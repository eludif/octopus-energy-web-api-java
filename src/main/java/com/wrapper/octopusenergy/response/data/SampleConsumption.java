package com.wrapper.octopusenergy.response.data;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SampleConsumption {

    @SerializedName("electricity_single_rate")
    @Expose
    private ElectricitySingleRate electricitySingleRate;
    @SerializedName("electricity_dual_rate")
    @Expose
    private ElectricityDualRate electricityDualRate;
    @SerializedName("dual_fuel_single_rate")
    @Expose
    private DualFuelSingleRate dualFuelSingleRate;
    @SerializedName("dual_fuel_dual_rate")
    @Expose
    private DualFuelDualRate dualFuelDualRate;

    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}