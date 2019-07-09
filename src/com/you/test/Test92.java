package com.you.test;
import java.io.PrintStream;
public class Test92 {
	public static void main(String[] args) {
		Test92[] tests = new Test92[100];
		PrintStream err = System.err;
		long time = System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
			Test92 test = tests[70];	
		}
		long time2 = System.currentTimeMillis();
		err.println(time2 - time);
	}
}
