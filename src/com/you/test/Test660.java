package com.you.test;

import com.google.common.cache.CacheBuilder;

// Guava.CacheBuilder
public class Test660 {
    public static void main(String[] args) {
        CacheBuilder cacheBuilder = CacheBuilder.newBuilder();
        cacheBuilder.initialCapacity(-10);
    }
}
