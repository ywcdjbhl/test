package com.you.test;

public class Test529 {
    @Override
    protected void finalize() {
        Thread t = Thread.currentThread();
        System.err.println(t + " " + this);
    }
}
