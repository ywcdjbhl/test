package com.you.test;

import java.lang.reflect.Array;

/**
 * java.lang.reflect.Array.getLength
 */
public class Test562 {
    public static void main(String[] args) {
        Double[] ds = new Double[] {4D, 5D ,8D, -8.6D, 6D};
        int i = Array.getLength(ds);
        System.err.println("i=" + i);
        Float[] fs = new Float[] {};
        int i2 = Array.getLength(fs);
        System.err.println("i2=" + i2);
        Array.getLength(new Double(91));
    }
}
