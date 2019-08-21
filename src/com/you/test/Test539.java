package com.you.test;

class Test539_1 implements Test539_2, Test539_3 {
    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }
}

interface Test539_2 {
    void eat();
}

interface Test539_3 {
    void drink();
}

public class Test539 {
    public static void main(String[] args) {
        Test539_1 test = new Test539_1();
        System.err.println(test instanceof Test539_2);
        System.err.println(test instanceof Test539_3);
        Test539_2 test2 = (Test539_2) test;
        Test539_3 test3 = (Test539_3) test;
    }
}
