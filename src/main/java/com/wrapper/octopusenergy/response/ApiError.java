package com.wrapper.octopusenergy.response;

import lombok.Data;

@Data
public class ApiError {
    private String code;
    private String message;
}
