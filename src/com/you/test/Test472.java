package com.you.test;

public class Test472 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println(1233);
            }
        });
    }
}
