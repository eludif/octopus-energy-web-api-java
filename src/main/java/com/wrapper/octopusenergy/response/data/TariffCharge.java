package com.wrapper.octopusenergy.response.data;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public Double getValueExcVat() {
        return valueExcVat;
    }

    public void setValueExcVat(Double valueExcVat) {
        this.valueExcVat = valueExcVat;
    }

    public Double getValueIncVat() {
        return valueIncVat;
    }

    public void setValueIncVat(Double valueIncVat) {
        this.valueIncVat = valueIncVat;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}