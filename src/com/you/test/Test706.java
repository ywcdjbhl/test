package com.you.test;

import io.netty.util.concurrent.DefaultThreadFactory;

// DefaultThreadFactory

public class Test706 {
    public static void main(String[] args) {
        String s = "tttt";
        new DefaultThreadFactory(s, false, 0);
    }
}
