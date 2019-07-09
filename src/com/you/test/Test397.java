package com.you.test;
import java.io.PrintStream;
public class Test397 {
    public static void main(String[] args) {
        int i = 1;
        int i2 = 4;
        int i3 = 10;
        int i4 = -1;
        int i5 = -8;
        int[] is = {i ,i2, i3, i4, i5};
        PrintStream out = System.err;
        for (int j = 0; j < is.length; j++) {
            out.printf("%d", is[j]);
            out.printf("\n");
        }
    }
}
