package com.you.test;

import org.springframework.core.env.MissingRequiredPropertiesException;

// MissingRequiredPropertiesException
public class Test726 {
    public static void main(String[] args) {
        MissingRequiredPropertiesException ex = new MissingRequiredPropertiesException();
        System.err.println(ex);
    }
}
