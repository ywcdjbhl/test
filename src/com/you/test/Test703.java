package com.you.test;

import io.netty.util.internal.ObjectUtil;

public class Test703 {
    public static void main(String[] args) {
        Class clazz = null;
        Object object = ObjectUtil.checkNotNull(clazz, "eat");
        System.err.println(object);
        System.err.println(object == clazz);
    }
}
