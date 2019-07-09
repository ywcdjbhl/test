package com.you.test;

public class Test490 {
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
