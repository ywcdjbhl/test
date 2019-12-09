package com.you.test;

import java.lang.reflect.Array;

/**
 * java.lang.reflect.Array.newInstance
 */
public class Test571 {
    public static void main(String[] args) {
        Class clazz = Void.class;
        System.err.println(clazz);
        Array.newInstance(clazz, 7);
    }
}
