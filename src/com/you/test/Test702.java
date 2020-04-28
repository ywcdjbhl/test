package com.you.test;

import com.you.YOU;
import io.netty.util.internal.StringUtil;

public class Test702 {
    public static void main(String[] args) {
        Class clazz = YOU.class;
        String name = StringUtil.simpleClassName(clazz);
        System.err.println(name);
    }
}
