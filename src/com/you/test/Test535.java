package com.you.test;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test535 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(0);
        System.err.println(array);
        array = new AtomicIntegerArray(5);
        System.err.println(array);
    }
}
