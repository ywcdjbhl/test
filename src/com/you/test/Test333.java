package com.you.test;

public class Test333 {
	public static void main(String[] args) {
		float f = 3.3F;
		int i = (int)f;
		double d = (double)f;
		boolean b = false;
		System.out.println(i);
		System.out.println(d);
//		boolean b = (boolean)f;
//		Boolean b = (Boolean)f;
//		Test333 test = (Test333)f;
		Object obj = (Object)f;
		System.out.println(obj);
		System.out.println(obj.getClass().getName());
		Test333 test2 = new Test333();
//		f = (float)test2;
//		d = (double)test2;
		test2 = null;
//		f = (float)test2;
//		d = (double)test2;
//		f = (float)null;
//		d = (double)null;
//		b = (boolean)null;
		b = (Boolean)null;
	}
}
