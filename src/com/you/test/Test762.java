package com.you.test;

import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class Test762 {
    public static void main(String[] args) throws Exception {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String locationPattern = null;
        resolver.getResources(locationPattern);
    }
}
