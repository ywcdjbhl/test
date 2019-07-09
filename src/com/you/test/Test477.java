package com.you.test;

public class Test477 {
    public Object[] getArray() {
        return new Object[2];
    }
    public static void main(String[] args) {
        Test477 test = new Test477();
        Object[] objects = test.getArray();
        System.err.println(objects.getClass());
        System.err.println("-------");
        Test477_2 test2 = new Test477_2();
        Double[] ds = test2.getArray();
        System.err.println(ds.getClass());
        Object[] objects2 = test2.getArray();
        System.err.println(objects2.getClass());
        System.err.println("-------");
        Test477 test3 = new Test477_2();
        Object[] ds3 = test3.getArray();
        System.err.println(ds3.getClass());
    }
}

class Test477_2 extends Test477 {
    public Double[] getArray() {
        return new Double[5];
    }
}
