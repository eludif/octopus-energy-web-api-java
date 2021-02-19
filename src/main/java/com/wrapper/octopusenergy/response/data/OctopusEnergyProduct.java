package com.wrapper.octopusenergy.response.data;

import java.util.List;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wrapper.octopusenergy.response.Response;

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
    private List<Links> links = null;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsVariable() {
        return isVariable;
    }

    public void setIsVariable(Boolean isVariable) {
        this.isVariable = isVariable;
    }

    public Boolean getIsGreen() {
        return isGreen;
    }

    public void setIsGreen(Boolean isGreen) {
        this.isGreen = isGreen;
    }

    public Boolean getIsTracker() {
        return isTracker;
    }

    public void setIsTracker(Boolean isTracker) {
        this.isTracker = isTracker;
    }

    public Boolean getIsPrepay() {
        return isPrepay;
    }

    public void setIsPrepay(Boolean isPrepay) {
        this.isPrepay = isPrepay;
    }

    public Boolean getIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(Boolean isBusiness) {
        this.isBusiness = isBusiness;
    }

    public Boolean getIsRestricted() {
        return isRestricted;
    }

    public void setIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(String availableFrom) {
        this.availableFrom = availableFrom;
    }

    public String getAvailableTo() {
        return availableTo;
    }

    public void setAvailableTo(String availableTo) {
        this.availableTo = availableTo;
    }

    public String getTariffsActiveAt() {
        return tariffsActiveAt;
    }

    public void setTariffsActiveAt(String tariffsActiveAt) {
        this.tariffsActiveAt = tariffsActiveAt;
    }

    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }

    public JsonObject getSingleRegisterElectricityTariffs() {
        return singleRegisterElectricityTariffs;
    }

    public void setSingleRegisterElectricityTariffs(JsonObject singleRegisterElectricityTariffs) {
        this.singleRegisterElectricityTariffs = singleRegisterElectricityTariffs;
    }

    public JsonObject getDualRegisterElectricityTariffs() {
        return dualRegisterElectricityTariffs;
    }

    public void setDualRegisterElectricityTariffs(JsonObject dualRegisterElectricityTariffs) {
        this.dualRegisterElectricityTariffs = dualRegisterElectricityTariffs;
    }

    public JsonObject getSingleRegisterGasTariffs() {
        return singleRegisterGasTariffs;
    }

    public void setSingleRegisterGasTariffs(JsonObject singleRegisterGasTariffs) {
        this.singleRegisterGasTariffs = singleRegisterGasTariffs;
    }

    public JsonObject getSampleQuotes() {
        return sampleQuotes;
    }

    public void setSampleQuotes(JsonObject sampleQuotes) {
        this.sampleQuotes = sampleQuotes;
    }

    public SampleConsumption getSampleConsumption() {
        return sampleConsumption;
    }

    public void setSampleConsumption(SampleConsumption sampleConsumption) {
        this.sampleConsumption = sampleConsumption;
    }

    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}