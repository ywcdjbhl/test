package com.you.test;

import java.lang.annotation.Annotation;

public class Test548 {
    public static void main(String[] args) {
        Class clazz = Test549.class;
        System.err.println(clazz);
        Annotation[] as = clazz.getAnnotations();
        for (Annotation a : as) {
            System.err.println(a);
        }
    }
}
