package com.you.test;

public class Test265 {
	public static void main(String[] args) {
		int i = Integer.MAX_VALUE;
		int i2 = i++;
		System.err.println(i);
		System.err.println(i2);
		System.err.println(i > i2);
	}
}
