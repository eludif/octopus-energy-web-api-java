package com.wrapper.octopusenergy.response.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class DualFuelSingleRate {
    @SerializedName("electricity_standard")
    @Expose
    private Integer electricityStandard;
    @SerializedName("gas_standard")
    @Expose
    private Integer gasStandard;
}