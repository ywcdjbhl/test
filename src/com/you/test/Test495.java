package com.you.test;

import java.util.ArrayList;
import java.util.List;

public class Test495 {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            byte[] bs = new byte[1024 * 1024];
            list.add(bs);
        }
    }
}
