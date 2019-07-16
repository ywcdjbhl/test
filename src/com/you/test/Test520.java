package com.you.test;

// ThreadPoolExecutor的常量
public class Test520 {
    public static void main(String[] args) {
        int COUNT_BITS = Integer.SIZE - 3;
        int CAPACITY   = (1 << COUNT_BITS) - 1;
        int RUNNING    = -1 << COUNT_BITS;
        int SHUTDOWN   =  0 << COUNT_BITS;
        int STOP       =  1 << COUNT_BITS;
        int TIDYING    =  2 << COUNT_BITS;
        int TERMINATED =  3 << COUNT_BITS;
        System.err.println(RUNNING);
        System.err.println(SHUTDOWN);
        System.err.println(STOP);
        System.err.println(TIDYING);
        System.err.println(TERMINATED);
    }
}
