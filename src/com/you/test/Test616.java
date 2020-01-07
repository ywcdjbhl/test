package com.you.test;

import org.springframework.core.io.DefaultResourceLoader;

public class Test616 {
    public static void main(String[] args) {
        DefaultResourceLoader loader = new DefaultResourceLoader();
        loader.getResource("classpath:eat.java");

    }
}
