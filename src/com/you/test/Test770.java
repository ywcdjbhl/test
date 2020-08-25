package com.you.test;

import org.slf4j.MDC;

// MDC
public class Test770 {
    public static void main(String[] args) {
        String key = "lebron";
        String value = "james";
        MDC.put(key, value);
    }
}
