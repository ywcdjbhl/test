package com.you.test;

public class Test305 {
	public static void main(String[] args) {
		long l = 1;
		int i = (int) (l << 30);
		long l2 = l << 30;
		System.err.println(l2 == i);
		i = (int) (l << 31);
		System.err.println(i);
		l2 = l << 31;
		System.err.println(l2);
	}
}
