package com.you.test;

public class Test185 {
	public static void main(String[] args) {
		System.out.println(new Object[0][1][][] instanceof Object[][][][]);
		Test185 test = new Test185();
		test.run(new Object[2][][][][]);
		
	}
	public void run(Object[][] s) {
		System.out.println("-------");
	}
}
