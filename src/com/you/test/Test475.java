package com.you.test;

public class Test475 {
    public static void main(String[] args) {
        Long[] ls = new Long[8];
        Class clazz = ls.getClass();
        Class clazz2 = clazz.getComponentType();
        System.err.println(clazz2);
        Test475[] ts = new Test475[11];
        Class clazz3 = ts.getClass();
        Class clazz4 = clazz3.getComponentType();
        System.err.println(clazz4);
        Object[] objects = new Object[3];
        Class clazz5 = objects.getClass();
        Class clazz6 = clazz5.getComponentType();
        System.err.println(clazz6);
        Double d = new Double(9);
        Class clazz7 = d.getClass();
        Class clazz8 = clazz7.getComponentType();
        System.err.println(clazz8);
        Test475 test = new Test475();
        Class clazz9 = test.getClass();
        Class clazz10 = clazz9.getComponentType();
        System.err.println(clazz10);
        Void[] voids = new Void[9];
        Class clazz11 = voids.getClass();
        Class clazz12 = clazz11.getComponentType();
        System.err.println(clazz12);
    }
}
