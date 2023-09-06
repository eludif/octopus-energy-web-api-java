package com.wrapper.octopusenergy.response.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ElectricityDualRate {
    @SerializedName("electricity_day")
    @Expose
    private Integer electricityDay;
    @SerializedName("electricity_night")
    @Expose
    private Integer electricityNight;
}