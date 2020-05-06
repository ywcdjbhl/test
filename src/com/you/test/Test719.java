package com.you.test;

import java.util.Optional;

// Optional
public class Test719 {
    public static void main(String[] args) {
        Optional op = Optional.empty();
        Object object = op.orElse(976);
        System.err.println(object);
    }
}
