package com.you.test;

import java.io.PrintStream;
// int转化成二进制字符串（补码）
public class Test365 {
    public static String toBinaryStringLow(int i) {
        int len;// i的二进制的最高位的1的位数
        if (i < 0) {
            len = 32;
        } else {
            for (int n = 0; ; ) {
                if (i >>> n == 0) {
                    len = n;
                    break;
                }
                n++;
                if (n == 33) {
                    throw new Error();
                }
            }
        }
        if (len == 0) {
            return "0";
        }
        char[] buff = new char[len];
        for (int n = 0; ; ) {
            if (i >>> n == 0) {
                break;
            }
            if (((i >>> n) & 1) == 0) {
                buff[len - n -1] = '0';
            } else if (((i >>> n) & 1) == 1) {
                buff[len - n -1] = '1';
            } else {
                throw new Error();
            }
            n++;
            if (n == 32) {
                buff[0] = '1';
                break;
            }
        }
        String str = new String(buff);
        return str;
    }

    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        for (int i = Integer.MIN_VALUE; ; ) {
            if (!Integer.toBinaryString(i).equals(toBinaryStringLow(i))) {
                throw new Exception();
            }
            if (i == Integer.MAX_VALUE) {
                err.println("结束");
                break;
            }
            i++;
        }
    }
}
