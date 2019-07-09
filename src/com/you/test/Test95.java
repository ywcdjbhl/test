package com.you.test;
import java.io.PrintStream;
public class Test95 {
	public void test() {
		for (int i = 0; i < 1000000000; i++) {
			int j = 888;
			j = j * 64;	
		}
	}
	
	public static void main(String[] args) {
		PrintStream err = System.err;
		Test95 test = new Test95();
		long time = System.currentTimeMillis();
		test.test();
		long time2 = System.currentTimeMillis();
		err.println(time2 - time);
		
	}
	
}
