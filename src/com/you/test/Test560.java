package com.you.test;

import java.lang.annotation.Annotation;

public class Test560 {
    public static void main(String[] args) throws Exception {
        Class clazz = Test556.class;
        System.err.println(clazz);
        boolean flag = clazz.isInterface();
        System.err.println(flag);
        flag = Annotation.class.isAssignableFrom(clazz);
        System.err.println(flag);
        clazz.newInstance();
    }
}
