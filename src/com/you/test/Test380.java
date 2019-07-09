package com.you.test;

public class Test380 {
    public static void main(String[] args) {
        int i = 5;
        if (i-- == 5) {
            System.err.println("ee");
        }
        i = 5;
        if (--i == 4) {
            System.err.println("ee");
        }
        i = 5;
        if (--i != 4) {
            System.err.println("ee");
        }
        i = 5;
        if (i-- != 5) {
            System.err.println("ee");
        }
    }
}
