package com.you.test;

import org.springframework.beans.BeanUtils;

import java.util.AbstractSet;
import java.util.Set;

// BeanUtils.instantiateClass
public class Test766 {
    public static void main(String[] args) {
        Class clazz = AbstractSet.class;
        System.err.println(clazz);
        BeanUtils.instantiateClass(clazz);
    }
}
