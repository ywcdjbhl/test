package com.you.test;

import java.lang.annotation.Annotation;

public class Test689 {
    public static void main(String[] args) {
        Class clazz688 = Test688.class;
        System.err.println(clazz688);
        Annotation[] as = clazz688.getAnnotations();
        System.err.println(as);
        System.err.println(as.length);
        System.err.println("-----");
        Class clazz687 = Test687.class;
        System.err.println(clazz687);
        Annotation[] as2 = clazz687.getAnnotations();
        System.err.println(as2);
        System.err.println(as2.length);
    }
}
