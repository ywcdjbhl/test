package com.you.test;

import java.lang.annotation.Annotation;

public class Test583 {
    public static void main(String[] args) {
        Class clazz = Test582.class;
        System.err.println(clazz);
        Class clazz2 = Test580.class;
        System.err.println(clazz2);
        Test580 test = (Test580) clazz.getAnnotation(clazz2);
        System.err.println(test);
        boolean flag = test instanceof Annotation;
        System.err.println(flag);
    }
}
