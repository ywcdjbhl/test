package com.you.test;

public class Test455 {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.err.println(t.isDaemon());
        t.setDaemon(false);
        System.err.println(t.isDaemon());
        t.setDaemon(true);
        System.err.println(t.isDaemon());
    }
}


