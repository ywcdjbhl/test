package com.you.test;

public class Test458 {
    public static void main(String[] args) {
        ThreadTest458 t = new ThreadTest458();
        t.setDaemon(true);
        t.start();
        System.err.println("main over");
    }
}

class ThreadTest458 extends Thread {

    int i = 0;

    @Override
    public void run() {
        while (true) {
            i = i + 1;
        }
    }
}
