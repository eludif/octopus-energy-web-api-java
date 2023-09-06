package com.wrapper.octopusenergy.response.data;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wrapper.octopusenergy.response.Response;
import lombok.Data;

import java.util.List;

@Data
public class TariffChargeData extends Response<TariffChargeData> {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("next")
    @Expose
    private Object next;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("results")
    @Expose
    private List<TariffCharge> tariffCharges = null;

    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}