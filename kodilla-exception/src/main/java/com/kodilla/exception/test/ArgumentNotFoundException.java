package com.kodilla.exception.test;

public class ArgumentNotFoundException extends Exception {
    public ArgumentNotFoundException(final String message) {
        super(message);
    }
}
