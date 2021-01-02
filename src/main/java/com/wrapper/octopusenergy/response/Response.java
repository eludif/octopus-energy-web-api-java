package com.wrapper.octopusenergy.response;

public class Response<T> {
    private transient ApiResponse<T> response;

    public void setResponse(ApiResponse<T> response) {
        this.response = response;
    }

    public boolean isSuccessful() {
        return response.isSuccessful();
    }
}
