package com.example.service_centre.exception;

public class CustomCustomerException extends RuntimeException {
    public CustomCustomerException(String errorMessage) {
        super(errorMessage);
    }
}
