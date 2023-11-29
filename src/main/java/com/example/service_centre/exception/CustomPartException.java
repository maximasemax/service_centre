package com.example.service_centre.exception;

public class CustomPartException extends RuntimeException {
    public CustomPartException(String errorMessage) {
        super(errorMessage);
    }
}
