package com.you.test;

public class Test523LawThread extends Thread {

    public Test523LawThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.err.println(t);
    }
}
