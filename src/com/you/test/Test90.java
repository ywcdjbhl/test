package com.you.test;
import java.io.PrintStream;
public class Test90 {
	public int test(int cap) {
		int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n;
	}
	
	public static void main(String[] args) {
		Test90 test = new Test90();
		int n = test.test(-2);
		PrintStream err = System.err;
		err.println(n);
	}
}
