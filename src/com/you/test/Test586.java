package com.you.test;

// addSuppressed
public class Test586 {
    public static void main(String[] args) {
        Exception e = new Exception();
        e.addSuppressed(e);
    }
}
