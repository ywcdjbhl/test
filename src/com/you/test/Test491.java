package com.you.test;

public class Test491 {
    public static int count;
    public static void main(String[] args) {
        eat();
    }

    public static void eat() {
        count = count + 1;
        try {
            System.err.println(count);
            eat();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Test491_2 {
    public static int count;
    public static void main(String[] args) {
        eat();
    }

    public static void eat() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int ee = 5;
        int f = 6;
        int g = 7;
        int h = 9;
        int i = 10;
        int j = 11;
        int k = 12;
        int l = 13;
        count = count + 1;
        try {
            System.err.println(count);
            eat();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
