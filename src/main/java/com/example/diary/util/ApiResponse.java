package com.example.diary.util;

public class ApiResponse<T> {
    private String code;
    private String message;
    private T data;

    public ApiResponse(ResponseCode responseCode, T data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
    }
}
