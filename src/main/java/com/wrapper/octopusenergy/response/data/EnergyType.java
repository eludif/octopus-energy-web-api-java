package com.wrapper.octopusenergy.response.data;

public enum EnergyType {

    GAS_TARIFFS("gas-tariffs"),
    ELECTRICITY_TARIFFS("electricity-tariffs");

    private final String value;

    EnergyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
