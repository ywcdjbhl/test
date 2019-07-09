package com.you.test;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class Test78 {
	public void test() {
		List<Long> list = new ArrayList<Long>();
		Long num = 1L;
		for (int i = 0; i < 6000000; i++) {
			list.add(num);
			num++;
		}
		long time = System.currentTimeMillis();
		list.add(2, -300000L);
		long time2 = System.currentTimeMillis();
		PrintStream err = System.err;
		err.println(time2 - time);
	}
	public void test2() {
		List<Long> list = new LinkedList<Long>();
		Long num = 1L;
		for (int i = 0; i < 6000000; i++) {
			list.add(num);
			num++;
		}
		long time = System.currentTimeMillis();
		list.add(2, -300000L);
		long time2 = System.currentTimeMillis();
		PrintStream err = System.err;
		err.println(time2 - time);
	}
	public void test3() {
		Set<Long> set = new HashSet<Long>();
		Long num = 1L;
		for (int i = 0; i < 1000000; i++) {
			set.add(num);
			num++;
		}
		long time = System.currentTimeMillis();
		set.add(-300000L);
		long time2 = System.currentTimeMillis();
		PrintStream err = System.err;
		err.println(time2 - time);
	}
	public static void main(String[] args) {
		Test78 test = new Test78();
		test.test();
	}
}
