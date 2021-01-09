package com.wrapper.octopusenergy.response.data;

public enum GroupType {
    HOUR("hour"),
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    QUARTER("quarter");

    private String value;

    GroupType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
