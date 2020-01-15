package com.you.test;

public class Test630 {
    public void eat() {
        int i = 3;
        if (1 == 1) {
            throw new Test629();
        }
    }

    public static void main(String[] args) {
        Test630 test = new Test630();
        try {
            test.eat();
        } catch (Test628 e) {
            System.err.println(e);
        }

    }
}
