package com.you.test;

public class Test522 {
    public static void main(String[] ars) {
        int i = 0;
        try {
            i = 2;
            float f = 3 / 0;
            i = 3;
        } finally {
            i = 5;
            System.err.println(i);
        }
    }
}
