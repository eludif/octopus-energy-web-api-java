package com.wrapper.octopusenergy.response.data;

public enum OrderType {
    FORWARDS("period"),
    BACKWARDS("-period");

    private final String value;

    OrderType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
