package com.wrapper.octopusenergy.response.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ElectricitySingleRate {
    @SerializedName("electricity_standard")
    @Expose
    private Integer electricityStandard;
}