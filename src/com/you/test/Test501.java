package com.you.test;

public class Test501 {
    public static void main(String[] args) {
        Test501_2 test = new Test501_2();
        System.gc();
        test = null;
        System.gc();

    }
}

class Test501_2 {

    @Override
    public void finalize() {
        System.err.println("finalize");
    }
}
