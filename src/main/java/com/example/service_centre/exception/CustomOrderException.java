package com.example.service_centre.exception;

public class CustomOrderException extends RuntimeException {
    public CustomOrderException(String errorMessage) {
        super(errorMessage);
    }
}
