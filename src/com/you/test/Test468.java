package com.you.test;
import java.lang.reflect.Field;
public class Test468 {
    public static void main(String[] args) throws Exception {
        Class clazz = Test468_2.class;
        System.err.println("-----");
        Field field = clazz.getDeclaredField("age");
        System.err.println("-----");
        field.get(null);
    }
}

class Test468_2 {
    static {
        System.err.println("static");
    }

    public static Long food = eat();

    public static int age;

    public static Long eat() {
        System.err.println("eat");
        return Long.valueOf(3);
    }
}
