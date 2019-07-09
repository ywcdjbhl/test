package com.you.test;

public class Test456 {
    public static void main(String[] args) {
        ThreadTest456 t = new ThreadTest456();
        System.err.println(t.isDaemon());
        t.setDaemon(true);
        System.err.println(t.isDaemon());
        t.setDaemon(false);
        System.err.println(t.isDaemon());
    }
}

class ThreadTest456 extends Thread {

    @Override
    public void run() {

    }
}
