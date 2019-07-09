package com.you.test;
import java.lang.reflect.Field;
public class Test467 {
    public static void main(String[] args) throws Exception {
        Class clazz = sun.misc.Unsafe.class;
        Field field = clazz.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Object object = field.get(null);
        sun.misc.Unsafe unsafe = (sun.misc.Unsafe) object;
        Class clazz2 = Test467_2.class;
        Field flag = clazz2.getField("flag");
        Field age = clazz2.getField("age");
        Field address = clazz2.getField("address");
        Field height = clazz2.getField("height");
        Field score = clazz2.getField("score");
        long flagoff = unsafe.objectFieldOffset(flag);
        long addressoff = unsafe.objectFieldOffset(address);
        long heightoff = unsafe.objectFieldOffset(height);
        long ageoff = unsafe.objectFieldOffset(age);
        long scoreoff = unsafe.objectFieldOffset(score);
        System.err.println(flagoff);
        System.err.println(addressoff);
        System.err.println(heightoff);
        System.err.println(ageoff);
        System.err.println(scoreoff);
        Test467_2 test = new Test467_2();
        System.err.println(test);
        // 根据上边打印的属性偏移量传参
        unsafe.putObject(test, 16L, true);
        unsafe.putObject(test, 20L, "harbin");
        unsafe.putObject(test, 24L, 185.5);
        unsafe.putObject(test, 12L, 29);
        unsafe.putObject(test, 28L, 100);
        System.err.println(test);
    }
}

class Test467_2 {
    public boolean flag;
    public int age;
    public String address;
    public Double height;
    public Integer score;

    @Override
    public String toString() {
        return "{" + this.flag + " " + this.age + " " + this.address + " " + this.score + " " + this.height + "}";
    }
}
