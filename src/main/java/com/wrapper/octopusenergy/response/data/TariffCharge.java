package com.wrapper.octopusenergy.response.data;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TariffCharge {

    @SerializedName("value_exc_vat")
    @Expose
    private Double valueExcVat;
    @SerializedName("value_inc_vat")
    @Expose
    private Double valueIncVat;
    @SerializedName("valid_from")
    @Expose
    private String validFrom;
    @SerializedName("valid_to")
    @Expose
    private String validTo;

    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}