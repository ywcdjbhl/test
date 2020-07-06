package com.you.test;

import org.springframework.beans.BeanUtils;

import java.util.Set;

// BeanUtils.instantiateClass
public class Test765 {
    public static void main(String[] args) {
        Class clazz = Set.class;
        System.err.println(clazz);
        BeanUtils.instantiateClass(clazz);
    }
}
