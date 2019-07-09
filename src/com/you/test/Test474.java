package com.you.test;

public class Test474 {
    public static void main(String[] args) {
        new Test474_2();
    }
}

class Test474_2 {
    static {
        System.err.println("static begin");
        age = eat();
        System.err.println("static end");
    }

    public static Integer age;

    public static Integer eat() {
        System.err.println("eat");
        return 94;
    }
}
