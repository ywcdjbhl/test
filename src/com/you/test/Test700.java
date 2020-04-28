package com.you.test;

import io.netty.util.internal.SystemPropertyUtil;

public class Test700 {
    public static void main(String[] args) {
        SystemPropertyUtil.getInt(null, 33);
    }
}
