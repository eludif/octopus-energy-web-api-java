package com.wrapper.octopusenergy.response.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ElectricityDualRate {

    @SerializedName("electricity_day")
    @Expose
    private Integer electricityDay;
    @SerializedName("electricity_night")
    @Expose
    private Integer electricityNight;

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

}