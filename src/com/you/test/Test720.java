package com.you.test;

import java.util.Optional;

// Optional
public class Test720 {
    public static void main(String[] args) {
        Optional op = Optional.empty();
        Object object = op.orElse(null);
        System.err.println(object);
    }
}
