package com.you.test;

import java.lang.reflect.Array;

/**
 * java.lang.reflect.Array.get
 */
public class Test568 {
    public static void main(String[] args) {
        Double[] ds = new Double[] {4D, 5D, 6D, 7D, 8D};
        Object object = Array.get(ds, 3);
        System.err.println(object);
    }
}
