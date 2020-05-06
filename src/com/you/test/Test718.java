package com.you.test;

import java.util.Optional;

// Optional
public class Test718 {
    public static void main(String[] args) {
        Optional op = Optional.of(456);
        Object object = op.orElse(null);
        System.err.println(object);
    }
}
