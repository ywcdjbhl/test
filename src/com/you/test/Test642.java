package com.you.test;

import com.google.common.cache.CacheBuilder;

// Guava.CacheBuilder
public class Test642 {
    public static void main(String[] args) {
        CacheBuilder cacheBuilder = CacheBuilder.newBuilder();
        cacheBuilder.maximumSize(10);
        cacheBuilder.maximumSize(11);
    }
}
