package com.you.test;

public class Test547 {
    public static void main(String[] args) {
        Class clazz = Test546.class;
        System.err.println(clazz);
        boolean flag = Enum.class.isAssignableFrom(clazz);
        System.err.println(flag);
    }
}
