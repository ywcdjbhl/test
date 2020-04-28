package com.you.test;

import com.you.YOU;
import io.netty.util.internal.ObjectUtil;

public class Test704 {
    public static void main(String[] args) {
        Class clazz = YOU.class;
        Object object = ObjectUtil.checkNotNull(clazz, "eat");
        System.err.println(object);
        System.err.println(object == clazz);
    }
}
