package com.wrapper.octopusenergy.response.data;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wrapper.octopusenergy.response.Response;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class OctopusEnergyProduct extends Response<OctopusEnergyProduct> {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("is_variable")
    @Expose
    private Boolean isVariable;
    @SerializedName("is_green")
    @Expose
    private Boolean isGreen;
    @SerializedName("is_tracker")
    @Expose
    private Boolean isTracker;
    @SerializedName("is_prepay")
    @Expose
    private Boolean isPrepay;
    @SerializedName("is_business")
    @Expose
    private Boolean isBusiness;
    @SerializedName("is_restricted")
    @Expose
    private Boolean isRestricted;
    @SerializedName("term")
    @Expose
    private Integer term;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("available_from")
    @Expose
    private String availableFrom;
    @SerializedName("available_to")
    @Expose
    private String availableTo;
    @SerializedName("tariffs_active_at")
    @Expose
    private String tariffsActiveAt;
    @SerializedName("single_register_electricity_tariffs")
    @Expose
    private JsonObject singleRegisterElectricityTariffs;
    @SerializedName("dual_register_electricity_tariffs")
    @Expose
    private JsonObject dualRegisterElectricityTariffs;
    @SerializedName("single_register_gas_tariffs")
    @Expose
    private JsonObject singleRegisterGasTariffs;
    @SerializedName("sample_quotes")
    @Expose
    private JsonObject sampleQuotes;
    @SerializedName("sample_consumption")
    @Expose
    private SampleConsumption sampleConsumption;
    @SerializedName("links")
    @Expose
    private List<Links> links;
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}