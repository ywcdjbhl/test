package com.you.test;

import java.lang.reflect.Array;

/**
 * java.lang.reflect.Array.newInstance
 */
public class Test577 {
    public static void main(String[] args) {
        Class clazz = Double.TYPE;
        System.err.println(clazz);
        Object object = Array.newInstance(clazz, -1);
        System.err.println(object);
    }
}
