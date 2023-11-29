package com.example.service_centre.exception;

public class CustomDeviceException extends RuntimeException {
    public CustomDeviceException(String errorMessage) {
        super(errorMessage);
    }
}
