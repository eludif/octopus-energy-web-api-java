package com.wrapper.octopusenergy.response.data;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wrapper.octopusenergy.response.Response;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class ElectricityMeterPoint extends Response<ElectricityMeterPoint> {

    @SerializedName("gsp")
    @Expose
    private String gsp;
    @SerializedName("mpan")
    @Expose
    private String mpan;
    @SerializedName("profile_class")
    @Expose
    private Integer profileClass;

}