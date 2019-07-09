package com.you.test;
import java.io.PrintStream;
public class Test64 {
	public static int test(int i) {
		i = i >> 1;
		return i;
	}
	public static void main(String[] args) {
		int i = test(8);
		PrintStream err = System.err;
		err.println(i);
	}
}
