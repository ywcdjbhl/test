package com.you.test;

public class Test61 {
	public void test() {
		Integer i = null;
		i.byteValue();
	}
	public void test2() {
		try {
			test();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Test61 test = new Test61();
		test.test2();
	}
}
