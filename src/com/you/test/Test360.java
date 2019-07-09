package com.you.test;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test360 {
    public static void main(String[] args) throws Exception {
        // UTF-8 一个字节 两个字节 三个字节
        // 一个字节 0XXXXXXX
        // 01111111 127 \u007f
        byte[] bs = new byte[1];
        bs[0] = 127;
        String s = new String(bs, "UTF-8");
        FileOutputStream out = new FileOutputStream(FileDescriptor.err);
        PrintStream ps = new PrintStream(out);
        ps.println(s.equals("" + '\u007f'));
        // 01110011 115 \u0073 s
        bs = new byte[1];
        bs[0] = 115;
        s = new String(bs, "UTF-8");
        ps.println(s.equals("s"));
        ps.println("----------------");
        // 两个字节 110XXXXX 10XXXXXX
        // 11111111111 \u07ff
        // 11011111 10111111
        // -33          -65
        bs = new byte[2];
        bs[0] = -33;
        bs[1] = -65;
        s = new String(bs, "UTF-8");
        ps.println(s.equals("\u07FF"));
        // 00110101110 \u01ae
        // 11000110 10101110
        // -58          -82
        bs = new byte[2];
        bs[0] = -58;
        bs[1] = -82;
        s = new String(bs, "UTF-8");
        ps.println(s);
        ps.println("----------------");
        // 三个字节
        // 1110XXXX 10XXXXXX 10XXXXXX
        // 1111111111000111 \uffc7
        // 11101111 10111111 10000111
        // -17      -65     -121
        bs = new byte[3];
        bs[0] = -17;
        bs[1] = -65;
        bs[2] = -121;
        s = new String(bs, "UTF-8");
        ps.println(s);
        // 0001000110001101 \u118d
        // 11100001 10000110 10001101
        // -31        -122      -115
        bs = new byte[3];
        bs[0] = -31;
        bs[1] = -122;
        bs[2] = -115;
        s = new String(bs, "UTF-8");
        ps.println(s);
    }
}
