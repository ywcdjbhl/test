package com.you.test;

import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

// Guava.CacheBuilder
public class Test665 {
    public static void main(String[] args) {
        CacheBuilder cacheBuilder = CacheBuilder.newBuilder();
        cacheBuilder.expireAfterWrite(-10, TimeUnit.SECONDS);
    }
}
