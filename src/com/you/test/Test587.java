package com.you.test;

// addSuppressed
public class Test587 {
    public static void main(String[] args) {
        Exception e = new Exception();
        Exception e2 = new Exception();
        e.addSuppressed(e2);
    }
}
