package com.you.test;

public class Test370 extends Test370_2 {
    public Test370() {
        this.age = 3;
        System.err.println("Test370" + this);
        System.err.println(this.age);
    }
    public static void main(String[] args) {
        new Test370();
    }
}

class Test370_2 extends Test370_3 {
    public Test370_2() {
        this.age = 4;
        System.err.println("Test370_2" + this);
    }
}

abstract class Test370_3 {
    int age = 1;
    public Test370_3() {
        this.age = 6;
        System.err.println("Test370_3" + this);
    }
}