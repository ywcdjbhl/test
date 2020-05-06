package com.you.test;

import java.util.Optional;

// Optional
public class Test721 {
    public static void main(String[] args) {
        Optional op = Optional.of(334);
        Object object = op.orElseGet(null);
        System.err.println(object);
    }
}
