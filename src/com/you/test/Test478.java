package com.you.test;

public class Test478 {
    public void eat(Object[] objects) {
        System.err.println(objects.getClass());
    }
    public static void main(String[] args) {
        Test478 test = new Test478();
        Object[] objects = new Object[8];
        test.eat(objects);
        Float[] fs = new Float[3];
        test.eat(fs);
        Byte[] bs = new Byte[2];
        test.eat(bs);
    }
}
