package com.you.test;

public class Test524LawThread extends Thread {

    public Test524LawThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.err.println(t);
    }
}
