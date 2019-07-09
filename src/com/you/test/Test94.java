package com.you.test;
import java.io.PrintStream;
public class Test94 {
	public int test(int cap) {
		int i = 1;
		while (cap > i) {
			i = i * 2;
		}
		return i;
	}
	
	public int test2 (int cap) {
		cap = cap - 1;
		cap = cap | cap >>> 1;
		cap = cap | cap >>> 2;
		cap = cap | cap >>> 4;
		cap = cap | cap >>> 8;
		cap = cap | cap >>> 16;
		return cap + 1;
	}
	
	public static void main(String[] args) {
		Test94 test = new Test94();
		PrintStream err = System.err;
		long time = System.currentTimeMillis();
		int cap = 122999999;
		for (int i = 0; i < 1000000000; i++) {
			cap = test.test(cap);
		}
		long time2 = System.currentTimeMillis();
		err.println(time2 - time + "\n" + cap);
	}
}
