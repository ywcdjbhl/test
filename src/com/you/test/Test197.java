package com.you.test;

public class Test197 extends Test197_2 {

	public static void main(String[] args) {
		Class clazz = Test197.class;
		Class clazz2 = Test197_2.class;
		Class clazz3 = Test197_3.class;
		System.out.println(clazz);
		System.out.println(clazz2);
		System.out.println(clazz3);
		System.out.println(clazz3 == clazz2);
		System.out.println(clazz3 == clazz);
		System.out.println(clazz2 == clazz);
		System.out.println(clazz2 instanceof Class);
	}

}

abstract class Test197_2 implements Test197_3 {
	
}
interface Test197_3 {
	
}