package com.wrapper.octopusenergy.response.data;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public ElectricitySingleRate getElectricitySingleRate() {
        return electricitySingleRate;
    }

    public void setElectricitySingleRate(ElectricitySingleRate electricitySingleRate) {
        this.electricitySingleRate = electricitySingleRate;
    }

    public ElectricityDualRate getElectricityDualRate() {
        return electricityDualRate;
    }

    public void setElectricityDualRate(ElectricityDualRate electricityDualRate) {
        this.electricityDualRate = electricityDualRate;
    }

    public DualFuelSingleRate getDualFuelSingleRate() {
        return dualFuelSingleRate;
    }

    public void setDualFuelSingleRate(DualFuelSingleRate dualFuelSingleRate) {
        this.dualFuelSingleRate = dualFuelSingleRate;
    }

    public DualFuelDualRate getDualFuelDualRate() {
        return dualFuelDualRate;
    }

    public void setDualFuelDualRate(DualFuelDualRate dualFuelDualRate) {
        this.dualFuelDualRate = dualFuelDualRate;
    }

    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}