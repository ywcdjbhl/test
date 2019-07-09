package com.you.test;
import java.lang.reflect.Field;
public class Test470 {
    public static void main(String[] args) throws Exception {
        Class clazz = Test470_2.class;
        Field field = clazz.getField("age");
        Test470_2 test = new Test470_2();
        test.age = 50;
        Test470_2 test2 = new Test470_2();
        test2.age = 80;
        Object object = field.get(test);
        Object object2 = field.get(test2);
        System.err.println(object.getClass());
        System.err.println(object2.getClass());
        System.err.println(object);
        System.err.println(object2);
        Object object3 = field.get(null);
        System.err.println(object3.getClass());
        System.err.println(object3);
        Object object4 = field.get("jskfjek");
        System.err.println(object4.getClass());
        System.err.println(object4);
        Object object5 = field.get(877L);
        System.err.println(object5.getClass());
        System.err.println(object5);

    }
}

class Test470_2 {
    public static int age = 30;
}
