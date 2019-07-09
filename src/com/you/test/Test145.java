package com.you.test;

public class Test145 {
	public static<T> T add(T x, T y) {
		return y;
	}
	public static void main(String[] args) {
		int i = Test145.add(1, 2);
		Number i2 = Test145.add(1, 2.6);
		Object i3 = Test145.add("s", 3);
		
		
		int i4 = Test145.<Integer>add(5, 7);
//		Test145.<Integer>add(2.8 , 9);
	}
}
