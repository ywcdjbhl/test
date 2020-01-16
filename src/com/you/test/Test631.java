package com.you.test;

import org.springframework.util.ObjectUtils;

// spring ObjectUtils

public class Test631 {
    public static void main(String[] args) {
        Object object = null;
        String s = ObjectUtils.identityToString(object);
        Object object2 = new Object();
        String s2 = ObjectUtils.identityToString(object2);
    }
}
