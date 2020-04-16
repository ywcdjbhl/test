package com.you.test;

import java.lang.annotation.Annotation;

public class Test692 {
    public static void main(String[] args) {
        Class clazz690 = Test690.class;
        System.err.println(clazz690);
        Annotation[] as = clazz690.getAnnotations();
        System.err.println(as);
        System.err.println(as.length);
        Class clazz691 = Test691.class;
        System.err.println(clazz691);
        Annotation[] as2 = clazz691.getAnnotations();
        System.err.println(as2);
        System.err.println(as2.length);
    }
}
