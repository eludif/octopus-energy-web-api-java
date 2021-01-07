package com.wrapper.octopusenergy.response.data;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wrapper.octopusenergy.response.Response;

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

    public String getGsp() {
        return gsp;
    }

    public void setGsp(String gsp) {
        this.gsp = gsp;
    }

    public String getMpan() {
        return mpan;
    }

    public void setMpan(String mpan) {
        this.mpan = mpan;
    }

    public Integer getProfileClass() {
        return profileClass;
    }

    public void setProfileClass(Integer profileClass) {
        this.profileClass = profileClass;
    }

    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}