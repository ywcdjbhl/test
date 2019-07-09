package com.you.test;

public class Test362 {
    public static void main(String[] args) throws Exception {
        // UTF-8
        // \u4e2d 中 1001110 00101101
        // 100 111000 101101
        // 1110XXXX 10XXXXXX 10XXXXXX
        // 11100100 10111000 10101101
        // 11100011 10110111 10101100
        // 10011100 11001000 11010011
        // -28       -72		-83
        String s = "中";
        byte[] bs = s.getBytes("UTF-8");
        System.err.println(bs.length);
        System.err.println(bs[0]);
        System.err.println(bs[1]);
        System.err.println(bs[2]);
    }
}
