package com.you.test;

public class Test359 extends Test359_2 {
    public Test359() {
        System.err.println("Test359构造方法");
    }
    public static void main(String[] args) {
        new Test359();
    }
}

abstract class Test359_2 {
    public Test359_2 () {
        System.err.println("Test359_2构造方法");
    }
}


