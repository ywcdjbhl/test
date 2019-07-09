package com.you.test;

import java.nio.ByteBuffer;

public class Test499 {
    public static void main(String[] args) {
        while (true) {
            ByteBuffer.allocateDirect(1024 * 1024);
        }
    }
}
