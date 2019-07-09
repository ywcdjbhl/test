package com.you.test;

public class Test463 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.err.println(t);
        Thread t2 = new Test463Thread();
        t2.start();
        t2.run();
    }
}

class Test463Thread extends Thread {
    public Test463Thread () {
        Thread t = Thread.currentThread();
        System.err.println(t);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.err.println(t);
    }
}