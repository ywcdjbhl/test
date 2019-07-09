package com.you.test;

public class Test514 extends Test513 {
    public static void main(String[] args) {
        Test514 test = new Test514();
        Thread t = Thread.currentThread();
        System.err.println(t);
        test.eat();
    }
}
