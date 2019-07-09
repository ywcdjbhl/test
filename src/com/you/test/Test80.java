package com.you.test;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
public class Test80 {
	
	
	public static void main(String[] args) {
		Map<Test80, Object> map = new HashMap<Test80, Object>();
		Object obj = new Object();
		long time = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			Test80 test = new Test80();
			map.put(test, obj);
		}
		long time2 = System.currentTimeMillis();
		PrintStream err = System.err;
		err.println(time2 - time);
	}
}
