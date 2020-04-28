package com.you.test;

import io.netty.util.concurrent.DefaultThreadFactory;

// DefaultThreadFactory

public class Test705 {
    public static void main(String[] args) {
        String s = null;
        new DefaultThreadFactory(s, false, 22);
    }
}
