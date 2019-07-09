package com.you.test;
import java.io.PrintStream;
public class Test85 {
	public void test() {
		int num = 12222;
		PrintStream err = System.err;
		long time = System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
			int result = num & 1;
		}
		long time2 = System.currentTimeMillis();
		err.println(time2 - time);
	}
	public void test2() {
		int num = 12222;
		PrintStream err = System.err;
		long time = System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
			int result = num % 2;
		}
		long time2 = System.currentTimeMillis();
		err.println(time2 - time);
	}
	public void test3() {
		int num = 12222;
		PrintStream err = System.err;
		long time = System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
			int result = num / 2;
			int result2 = num - result * 2;
		}
		long time2 = System.currentTimeMillis();
		err.println(time2 - time);
	}
	public static void main(String[] args) {
		Test85 test = new Test85();
		test.test2();
	}
}
