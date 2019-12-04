package com.you.test;

import java.lang.annotation.Annotation;

public class Test559 {
    public static void main(String[] args) {
        Class clazz = Test557.class;
        System.err.println(clazz);
        Class clazz2 = Test558.class;
        System.err.println(clazz2);
        Class clazzAn = Test556.class;
        System.err.println(clazzAn);
        Annotation an = clazz.getAnnotation(clazzAn);
        Annotation an2 = clazz2.getAnnotation(clazzAn);
        System.err.println(an);
        System.err.println(an2);
        boolean flag = an == an2;
        System.err.println(flag);
        flag = an.getClass() == an2.getClass();
        System.err.println(flag);

    }
}
