package com.wrapper.octopusenergy.response.data;

public enum MeterType {
    ELECTRICITY("electricity-meter-points"),
    GAS("gas-meter-points");

    private String value;

    MeterType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
