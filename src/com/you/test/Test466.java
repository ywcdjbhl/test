package com.you.test;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.reflect.Field;
public class Test466 {
    public static void main(String[] args) throws Exception {
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        Class clazz = list.getClass();
        Field field = clazz.getDeclaredField("array");
        field.setAccessible(true);
        Object object = field.get(list);
        System.err.println(object);
        Object object0 = field.get(list);
        list.add(9);
        Object object1 = field.get(list);
        System.err.println(object0 == object1);
        list.add("   ");
        Object object2 = field.get(list);
        System.err.println(object1 == object2);
        list.add("--");
        Object object3 = field.get(list);
        System.err.println(object2 == object3);
        list.add(new Test466());
        Object object4 = field.get(list);
        System.err.println(object3 == object4);
        list.add("~");
        Object object5 = field.get(list);
        System.err.println(object4 == object5);
    }
}
