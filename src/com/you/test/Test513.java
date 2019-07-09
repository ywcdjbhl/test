package com.you.test;

public class Test513 {
    public void eat() {
        System.err.println(this);
        Thread t = Thread.currentThread();
        System.err.println(t);
    }
}
