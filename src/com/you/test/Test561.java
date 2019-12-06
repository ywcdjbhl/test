package com.you.test;

public class Test561 {
    public static void main(String[] args) {
        Class clazz = Test560.class;
        System.err.println(clazz);
        Class clazz2 = clazz.getSuperclass();
        System.err.println(clazz2);
        Class clazz3 = clazz2.getSuperclass();
        System.err.println(clazz3);
    }
}
