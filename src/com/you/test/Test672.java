package com.you.test;

import java.util.List;

public class Test672 {

    public List<Number> eat() {
        return null;
    }

    public List<? extends Number> drink() {
        return null;
    }

    public static void main(String[] args) {
        Test672 test = new Test672();
        List<Number> list = test.eat();
        List<? extends Number> list2 = test.drink();
    }
}
