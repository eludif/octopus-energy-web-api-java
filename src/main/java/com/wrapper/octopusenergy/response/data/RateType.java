package com.wrapper.octopusenergy.response.data;

public enum RateType {
    STANDING_CHARGES("standing-charges"),
    STANDARD_UNIT_RATES("standard-unit-rates"),
    DAY_UNIT_RATES("day-unit-rates"),
    NIGHT_UNIT_RATES("night-unit-rates");

    private final String value;

    RateType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
