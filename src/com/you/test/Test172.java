package com.you.test;

import java.io.PrintStream;

public class Test172 {
	public void run() {
		PrintStream err = System.err;
		err.println(this.getClass().getName());
	}
	public static void main(String[] args) {
		Test172 test = new Test172_2();
		test.run();
	}
}
class Test172_2 extends Test172 {
	
}