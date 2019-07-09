package com.you.test;

public class Test496 {
    public static long age = 90;
    public long mark;
    public static void main(String[] args) {
        Test496 test = new Test496();
        test.mark = age;
        System.err.println(test.mark);
        Test496.age = 100;
        System.err.println(test.mark);
    }
}
