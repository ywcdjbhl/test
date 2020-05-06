package com.you.test;

import java.util.Optional;

// Optional
public class Test717 {
    public static void main(String[] args) {
        Optional op = Optional.of(456);
        Object object = op.orElse(89);
        System.err.println(object);
    }
}
