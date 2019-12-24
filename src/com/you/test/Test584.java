package com.you.test;

// Debug
public class Test584 {
    public static void main(String[] args) {
        Class clazz = Double.class;
        System.err.println(clazz);
        Double d = new Double(4);
        boolean flag = clazz.isInstance(d);
        System.err.println(flag);
        Class clazz2 = Number.class;
        System.err.println(clazz2);
        Float f = new Float(7);
        boolean flag2 = clazz2.isInstance(f);
        System.err.println(flag2);
    }
}
