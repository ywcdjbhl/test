package com.you.test;

public class Test578 {
    public static void main(String[] args) {
        Class clazz = void.class;
        System.err.println(clazz);
        Class clazz2 = (Class<Void>) clazz;
        System.err.println(clazz2);
        Class clazz3 = Void.TYPE;
        System.err.println(clazz3);
        System.err.println(clazz3 == clazz2);
        System.err.println(clazz3 == clazz);
    }
}
