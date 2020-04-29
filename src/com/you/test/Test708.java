package com.you.test;

import io.netty.util.internal.PlatformDependent;

// PlatformDependent

public class Test708 {
    public static void main(String[] args) {
        boolean an = PlatformDependent.isAndroid();
        System.err.println(an);
    }
}
