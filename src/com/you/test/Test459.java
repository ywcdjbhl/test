package com.you.test;

import java.lang.reflect.Field;

public class Test459 {
    public static void main(String[] args) throws Exception {
        Class clazz = sun.misc.Unsafe.class;
        Field field = clazz.getDeclaredField("theUnsafe");
        System.err.println(field);
        field.setAccessible(true);
        Object object = field.get(null);
        System.err.println(object);


    }
}
