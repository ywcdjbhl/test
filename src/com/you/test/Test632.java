package com.you.test;

import com.google.common.cache.CacheBuilder;

// Guava.CacheBuilder
public class Test632 {
    public static void main(String[] args) {
        CacheBuilder cacheBuilder = CacheBuilder.newBuilder();
        System.err.println(cacheBuilder.getClass());
    }
}
