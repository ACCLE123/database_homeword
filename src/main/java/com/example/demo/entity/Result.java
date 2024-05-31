package com.example.demo.entity;

import lombok.Data;

@Data
public class Result<T> {
    private boolean success;
    private String message;
    private T data;

    public Result(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(true, "success", data);
    }
    public static <T> Result<T> success() {
        return new Result<>(true, "success", null);
    }

    public static <T> Result<T> failure(String message) {
        return new Result<>(false, message, null);
    }
}
