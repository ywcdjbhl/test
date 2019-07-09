package com.you.test;
import java.io.PrintStream;
public class Test86 {
	public void test() {
		int num = 12222;
		PrintStream err = System.err;
		long time = System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
			int result = num << 2;
		}
		long time2 = System.currentTimeMillis();
		err.println(time2 - time);
	}
	public void test2() {
		int num = 12222;
		PrintStream err = System.err;
		long time = System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
			int result = num * 4;
		}
		long time2 = System.currentTimeMillis();
		err.println(time2 - time);
	}
	public static void main(String[] args) {
		Test86 test = new Test86();
		test.test();
	}
}
