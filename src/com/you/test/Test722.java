package com.you.test;

import java.util.Optional;

// Optional
public class Test722 {
    public static void main(String[] args) {
        Optional op = Optional.empty();
        Object object = op.orElseGet(null);
        System.err.println(object);
    }
}
