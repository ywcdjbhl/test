package com.you.test;

import java.lang.annotation.Annotation;

public class Test581 {
    public static void main(String[] args) {
        Class clazz = Test580.class;
        System.err.println(clazz);
        Class clazz2 = Annotation.class;
        System.err.println(clazz2);
        boolean flag = clazz2.isAssignableFrom(clazz);
        System.err.println(flag);
    }
}
