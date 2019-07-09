package com.you.test;

public class Test457 {
    public static void main(String[] args) {
        ThreadTest457 t = new ThreadTest457();
        t.start();
        System.err.println("main over");
    }
}

class ThreadTest457 extends Thread {

    int i = 0;

    @Override
    public void run() {
        while (true) {
            i = i + 1;
        }
    }
}
