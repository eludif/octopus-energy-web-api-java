package com.wrapper.octopusenergy.response.data;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wrapper.octopusenergy.response.Response;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class MeterConsumption extends Response<MeterConsumption> {

    @SerializedName("consumption")
    @Expose
    private Double consumption;
    @SerializedName("interval_start")
    @Expose
    private String intervalStart;
    @SerializedName("interval_end")
    @Expose
    private String intervalEnd;

    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }

}