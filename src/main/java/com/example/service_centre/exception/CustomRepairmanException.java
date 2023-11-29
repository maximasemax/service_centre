package com.example.service_centre.exception;

public class CustomRepairmanException extends RuntimeException {
    public CustomRepairmanException(String errorMessage) {
        super(errorMessage);
    }
}
