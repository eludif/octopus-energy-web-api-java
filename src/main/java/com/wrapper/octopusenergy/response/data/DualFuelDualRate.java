package com.wrapper.octopusenergy.response.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DualFuelDualRate {

    @SerializedName("electricity_day")
    @Expose
    private Integer electricityDay;
    @SerializedName("electricity_night")
    @Expose
    private Integer electricityNight;
    @SerializedName("gas_standard")
    @Expose
    private Integer gasStandard;

    public Integer getElectricityDay() {
        return electricityDay;
    }

    public void setElectricityDay(Integer electricityDay) {
        this.electricityDay = electricityDay;
    }

    public Integer getElectricityNight() {
        return electricityNight;
    }

    public void setElectricityNight(Integer electricityNight) {
        this.electricityNight = electricityNight;
    }

    public Integer getGasStandard() {
        return gasStandard;
    }

    public void setGasStandard(Integer gasStandard) {
        this.gasStandard = gasStandard;
    }

}