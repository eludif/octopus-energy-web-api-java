package com.wrapper.octopusenergy.response.data;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wrapper.octopusenergy.response.Response;

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

    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    public String getIntervalStart() {
        return intervalStart;
    }

    public void setIntervalStart(String intervalStart) {
        this.intervalStart = intervalStart;
    }

    public String getIntervalEnd() {
        return intervalEnd;
    }

    public void setIntervalEnd(String intervalEnd) {
        this.intervalEnd = intervalEnd;
    }

    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }

}