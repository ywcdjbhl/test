package com.you.test;

import java.io.PrintStream;
// TODO 未运行完
public class Test367 {
    // int转化成字符串低配
    public static String integerToStringLow(int i) {
        String sign = "";
        String number = "";
        if (i == Integer.MIN_VALUE) {
            return "-2147483648";
        }
        if (i < 0) {
            sign = "-";
            i = -i;
        }
        for (; ; ) {
            int j = i;
            i = i / 10;
            int k = j - i * 10;
            if (k == 0) {
                number = "0" + number;
            } else if (k == 1) {
                number = "1" + number;
            } else if (k == 2) {
                number = "2" + number;
            } else if (k == 3) {
                number = "3" + number;
            } else if (k == 4) {
                number = "4" + number;
            } else if (k == 5) {
                number = "5" + number;
            } else if (k == 6) {
                number = "6" + number;
            } else if (k == 7) {
                number = "7" + number;
            } else if (k == 8) {
                number = "8" + number;
            } else if (k == 9) {
                number = "9" + number;
            }
            if (i == 0) {
                break;
            }
        }
        return sign + number;
    }

    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        for (int i = Integer.MIN_VALUE; ; ) {
            if (!integerToStringLow(i).equals(Integer.toString(i))) {
                err.println(i + "不可以");
                throw new Exception();
            }
            if (i == Integer.MAX_VALUE) {
                break;
            }
            i++;
        }
        err.println("结束");
    }
}
