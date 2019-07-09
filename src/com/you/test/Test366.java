package com.you.test;

import java.io.PrintStream;
// TODO 未运行完
public class Test366 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        long time = System.currentTimeMillis();
        err.println("Integer start");
        for (int i = Integer.MIN_VALUE; ; ) {
            if (i >>> 32 != i) {
                throw new Exception();
            }
            if (i >> 32 != i) {
                throw new Exception();
            }
            if (i >>> 64 != i) {
                throw new Exception();
            }
            if (i >> 64 != i) {
                throw new Exception();
            }
            if (i >>> 32 != i) {
                throw new Exception();
            }
            if (i >> 32 != i) {
                throw new Exception();
            }
            if (i >>> 64 != i) {
                throw new Exception();
            }
            if (i >> 64 != i) {
                throw new Exception();
            }


            if (i << 32 != i) {
                throw new Exception();
            }
            if (i << 64 != i) {
                throw new Exception();
            }

            if (i == Integer.MAX_VALUE) {
                break;
            }
            i++;
        }
        err.println("Integer over");
        err.println("Long start");
        for (long i = Long.MIN_VALUE; ; ) {
            if (i >>> 64 != i) {
                throw new Exception();
            }
            if (i >> 64 != i) {
                throw new Exception();
            }
            if (i >>> 128 != i) {
                throw new Exception();
            }
            if (i >> 128 != i) {
                throw new Exception();
            }

            if (i << 64 != i) {
                throw new Exception();
            }
            if (i << 128 != i) {
                throw new Exception();
            }
            if (i == Long.MAX_VALUE) {
                break;
            }
            i++;
        }
        err.println("Long over");
        long time2 = System.currentTimeMillis();
        err.println("结束, 共" + (time2 - time) / 1000 + "秒");
    }
}
