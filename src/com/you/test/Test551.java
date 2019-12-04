package com.you.test;

import java.lang.annotation.Annotation;

public class Test551 {
    public static void main(String[] args) {
        Class clazz = Test550.class;
        System.err.println(clazz);
        Annotation[] as = clazz.getAnnotations();
        for (Annotation a : as) {
            System.err.println(a);
            System.err.println(System.identityHashCode(a));
        }
        Class clazz2 = Test552.class;
        System.err.println(clazz2);
        Annotation[] as2 = clazz2.getAnnotations();
        for (Annotation a : as2) {
            System.err.println(a);
            System.err.println(System.identityHashCode(a));

        }
    }
}
