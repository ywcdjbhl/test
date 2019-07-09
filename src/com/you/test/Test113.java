package com.you.test;

public class Test113 {
	public void run(Class clazz, Object ... keyValuePairs) {
		System.out.println(keyValuePairs);
	}
	public static void main(String[] args) {
		Test113 test = new Test113();
		test.run(Test111.class, 2,4,3);
	}
	
	
}
