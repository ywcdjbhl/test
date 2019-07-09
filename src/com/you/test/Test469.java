package com.you.test;
import java.lang.reflect.Field;
public class Test469 {
    public static void main(String[] args) throws Exception {
        Class clazz = Test469_2.class;
        Field field = clazz.getField("age");
        System.err.println(field);
        Test469_2 test = new Test469_2();
        test.age = 20;
        Test469_2 test2 = new Test469_2();
        test2.age = 40;
        Object object = field.get(test);
        Object object2 = field.get(test2);
        System.err.println(object.getClass());
        System.err.println(object2.getClass());
        System.err.println(object);
        System.err.println(object2);
        field.get(22);
    }
}

class Test469_2 {
    public int age;
}