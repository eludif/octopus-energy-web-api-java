package com.wrapper.octopusenergy.response.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DualFuelSingleRate {

    @SerializedName("electricity_standard")
    @Expose
    private Integer electricityStandard;
    @SerializedName("gas_standard")
    @Expose
    private Integer gasStandard;

    public Integer getElectricityStandard() {
        return electricityStandard;
    }

    public void setElectricityStandard(Integer electricityStandard) {
        this.electricityStandard = electricityStandard;
    }

    public Integer getGasStandard() {
        return gasStandard;
    }

    public void setGasStandard(Integer gasStandard) {
        this.gasStandard = gasStandard;
    }

}