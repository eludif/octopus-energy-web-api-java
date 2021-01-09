package com.wrapper.octopusenergy.response.data;

public enum OrderType {
    FORWARDS("period"),
    BACKWARDS("-period");

    private String value;

    OrderType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
