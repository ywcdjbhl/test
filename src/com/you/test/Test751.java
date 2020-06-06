package com.you.test;

public class Test751 {
    public static void main(String[] args) {
        Test750 test = new Test750("jamesharden");
        int i = test.scan(0, 7, "-", "*");
        System.err.println(i);
        int i2 = test.scan(0, 7, "e", "*");
        System.err.println(i2);
        int i3 = test.scan(0, 7, "^", "s");
        System.err.println(i3);
    }
}
