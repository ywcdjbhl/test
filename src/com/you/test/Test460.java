package com.you.test;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class Test460 {
    public Long age;
    public BigDecimal price;
    public static void main(String[] args) throws Exception {
        Class clazz = sun.misc.Unsafe.class;
        Field field = clazz.getDeclaredField("theUnsafe");
        System.err.println(field);
        field.setAccessible(true);
        Object object = field.get(10);
        System.err.println(object);
        sun.misc.Unsafe unsafe = (sun.misc.Unsafe) object;
        System.err.println(unsafe);
        Class clazz2 = Test460.class;
        System.err.println(clazz2);
        Field field2 = clazz2.getField("age");
        System.err.println(field2);
        long l = unsafe.objectFieldOffset(field2);
        System.err.println(l);
        Field field3 = clazz2.getField("price");
        System.err.println(field3);
        long l2 = unsafe.objectFieldOffset(field3);
        System.err.println(l2);
    }
}
