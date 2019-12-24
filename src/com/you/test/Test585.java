package com.you.test;

// addSuppressed
public class Test585 {
    public static void main(String[] args) {
        Exception e = new Exception();
        e.addSuppressed(null);
    }
}
