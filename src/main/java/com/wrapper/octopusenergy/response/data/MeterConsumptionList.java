package com.wrapper.octopusenergy.response.data;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wrapper.octopusenergy.response.Response;

import java.util.List;

public class MeterConsumptionList extends Response<MeterConsumptionList> {
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("previous")
    @Expose
    private String previous;
    @SerializedName("results")
    @Expose
    private List<MeterConsumption> consumptions = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<MeterConsumption> getConsumptions() {
        return consumptions;
    }

    public void setConsumptions(List<MeterConsumption> consumptions) {
        this.consumptions = consumptions;
    }

    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
