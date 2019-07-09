package com.you.test;

import java.io.PrintStream;

public class Test161 {
	private Test161_2 test = new Test161_2("1");
	private Test161_2 test2 = test;
	
	public static void main(String[] args) {
		Test161 test = new Test161();
		test.test = new Test161_2("2");
		PrintStream err = System.err;
		err.println(test.test.age);
		err.println(test.test2.age);
	}
	
}
class Test161_2 {
	public String age;
	public Test161_2(String age) {
		this.age = age;
	}
}

