package com.you.test;
import java.io.PrintStream;
public class Test378 {
    static PrintStream err = System.err;
    public static void main(String[] args) {
        int i;
        for (i = init(); compare(i); i = after(i)) {
            err.println("执行");
        }
    }

    public static int init() {
        err.println("循环初始化");
        return 1;
    }
    public static boolean compare(int i) {
        if (i < 6) {
            err.println("每次循环前的比较,通过");
        } else {
            err.println("每次循环前的比较,不通过");
        }

        return i < 6;
    }

    public static int after(int i) {
        err.println("每次循环后的操作");
        return ++i;
    }
}
