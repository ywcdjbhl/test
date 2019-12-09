package com.you.test;

import java.lang.reflect.Array;

/**
 * java.lang.reflect.Array.newInstance
 */
public class Test572 {
    public static void main(String[] args) {
        Class clazz = Void.TYPE;
        System.err.println(clazz);
        Array.newInstance(clazz, 7);
    }
}
