package com.you.test;

import java.io.PrintStream;

// 从网上copy的
public class Test363 {

    // 首先在jvm中一个int类型的数据占4个字节，共32位，其实就相当于一个长度为32的数组。
    // 那我们要计算首部0的个数，就是从左边第一个位开始累加0的个数，直到遇到一个非零值。
    public static int numberOfLeadingZeros(int i) {
        if (i == 0)
            return 32;
        int n = 1;
        // 下面的代码就是定位从左边开始第一个非零值的位置，在定位过程中顺便累加从左边开始0的个数
        // 将i无符号右移16位后，有二种情况；
        //   情况1.i=0,则第一个非零值位于低16位，i至少有16个0，同时将i左移16位（把低16位移到原高16位的位置，这样情况1和情况2就能统一后续的判断方式）
        //   情况2.i!=0,则第一个非零值位于高16位，后续在高16位中继续判断
        // 这个思路就是二分查找，首先把32位的数分为高低16位，如果非零值位于高16位，后续再将高16位继续二分为高低8位，一直二分到集合中只有1个元素
        if (i >>> 16 == 0) { n += 16; i <<= 16; }
        // 判断第一个非零值是否位于高8位
        if (i >>> 24 == 0) { n +=  8; i <<=  8; }
        // 判断第一个非零值是否位于高4位
        if (i >>> 28 == 0) { n +=  4; i <<=  4; }
        // 判断第一个非零值是否位于高2位
        if (i >>> 30 == 0) { n +=  2; i <<=  2; }
        // 判断第一个非零值是否位于左边第一位
        n -= i >>> 31;
        return n;
    }

    // 返回二进制(补码)第一个1前0的个数(低配版)
    public static int lowNumberOfLeadingZeros(int i) {
        if (i == 0) {
            return 32;
        }
        if (i < 0) {
            // 负数的符号位是1
            return 0;
        }
        for (int n = 1; ; ) {
            if (i >> n == 0) {
                return 32 - n;
            }
            n++;
            if (n == 32) {
                throw new Error();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = Integer.MIN_VALUE; ; i++) {
            PrintStream err = System.err;
            if (lowNumberOfLeadingZeros(i) != numberOfLeadingZeros(i)) {
                err.println("不相等" + i + "(" + lowNumberOfLeadingZeros(i) + ", " + numberOfLeadingZeros(i) + ")");
                throw new Exception();
            }
            if (i == Integer.MAX_VALUE) {
                err.println("结束");
                break;
            }
        }
    }
}
