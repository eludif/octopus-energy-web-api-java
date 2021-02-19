package com.wrapper.octopusenergy.response.data;

public enum MeterType {
    ELECTRICITY("electricity-meter-points"),
    ELECTRICITY_THREE_REGISTER("electricity-meter-points"),
    GAS("gas-meter-points");

    private final String value;

    MeterType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
