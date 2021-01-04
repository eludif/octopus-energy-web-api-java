package com.wrapper.octopusenergy.response.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ElectricitySingleRate {

    @SerializedName("electricity_standard")
    @Expose
    private Integer electricityStandard;

    public Integer getElectricityStandard() {
        return electricityStandard;
    }

    public void setElectricityStandard(Integer electricityStandard) {
        this.electricityStandard = electricityStandard;
    }

}