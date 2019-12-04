package com.you.test;

import java.lang.annotation.Annotation;

public class Test555 {
    public static void main(String[] args) {
        Class clazz = Test554.class;
        System.err.println(clazz);
        Class clazzAn = Test549.class;
        System.err.println(clazzAn);
        Annotation an = clazz.getAnnotation(clazzAn);
        System.err.println(an);
    }
}
