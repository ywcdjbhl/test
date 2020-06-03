package com.you.test;

import java.io.Serializable;

public class Test745 {
    public static void main(String[] args) {
        boolean flag = Serializable.class.isAssignableFrom(Test743.class);
        boolean flag2 = Serializable.class.isAssignableFrom(Test744.class);
        System.err.println(flag);
        System.err.println(flag2);
    }
}
