package com.you.test;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
public class Test87 {
	public int hashCode() {
		return 22;
	}
	public void test() {
		Map<Test87, Integer> map = new HashMap<Test87, Integer>();
		Test87 sp = new Test87();
		for (int i = 0; i < 100000; i++) {
			Test87 test = new Test87();
			map.put(test, null);
		}
		map.put(sp, null);
		PrintStream err = System.err;
		long time = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			map.get(sp);
		}
		long time2 = System.currentTimeMillis();
		err.println(time2 - time);
	}
	public static void main(String[] args) {
		Test87 test = new Test87();
		test.test();
	}
}
