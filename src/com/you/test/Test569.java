package com.you.test;

import java.lang.reflect.Array;

/**
 * java.lang.reflect.Array.get
 */
public class Test569 {
    public static void main(String[] args) {
        double[] ds = new double[] {4D, 5D, 6D, 7D, 8D};
        Object object = Array.get(ds, 3);
        System.err.println(object);
        Class clazz = object.getClass();
        System.err.println(clazz);
    }
}
