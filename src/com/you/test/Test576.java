package com.you.test;

import java.lang.reflect.Array;

/**
 * java.lang.reflect.Array.newInstance
 */
public class Test576 {
    public static void main(String[] args) {
        Class clazz = Double.TYPE;
        System.err.println(clazz);
        Object object = Array.newInstance(clazz, 259);
        System.err.println(object);
    }
}
