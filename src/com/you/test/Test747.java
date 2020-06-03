package com.you.test;

public class Test747 {
    public static void main(String[] args) {
        boolean flag = int.class.isAssignableFrom(int.class);
        System.err.println(flag);
        boolean flag2 = int.class.isAssignableFrom(Integer.class);
        System.err.println(flag2);
        boolean flag3 = Integer.class.isAssignableFrom(Integer.class);
        System.err.println(flag3);
        boolean flag4 = Integer.class.isAssignableFrom(int.class);
        System.err.println(flag4);
    }
}
