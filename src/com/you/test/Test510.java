package com.you.test;

import java.util.Arrays;

public class Test510 {
    public static void main(String[] args) {
        Object[] a1 = Test510_2.bs;
        Object[] a2 = Test510_2.bs;
        boolean flag = Arrays.deepEquals(a1, a2);
        System.err.println(flag);
        flag = Arrays.deepEquals(null, null);
        System.err.println(flag);
        Object[] a3 = new Object[4];
        Object[] a4 = new Object[6];
        flag = Arrays.deepEquals(a3, a4);
        System.err.println(flag);
        Object[] a5 = new Object[6];
        Object[] a6 = new Object[6];
        flag = Arrays.deepEquals(a5, a6);
        System.err.println(flag);
        Object object = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object[] a7 = new Object[] {object, object2, object3};
        Object[] a8 = new Object[] {object, object2, object3};
        flag = Arrays.deepEquals(a7, a8);
        System.err.println(flag);
        Object[] a9 = new Object[] {object, null, object2, object3};
        Object[] a10 = new Object[] {object, null, object2, object3};
        flag = Arrays.deepEquals(a9, a10);
        System.err.println(flag);
    }
}

class Test510_2 {
    public static Object[] bs = new Object[3];
}