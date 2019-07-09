package com.you.test;

public class Test385 extends Test385_2 {
    public static void main(String[] ars) {
        Test385_3 test = new Test385_3();
    }
}

class Test385_2 {
    static {
        System.err.println("Test385_2静态块");
    }
}

class Test385_3 extends Test385_2 {
    static {
        System.err.println("Test385_3静态块");
    }
}