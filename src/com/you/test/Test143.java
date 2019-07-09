package com.you.test;

import java.io.PrintStream;

public class Test143<T> {
	public static void main(String[] args) {
		Test143<Test143> test = new Test143<Test143>();
		Test143<Test142> test2 = new Test143<Test142>();
		PrintStream err = System.err;
		err.println(test.getClass() == test2.getClass());
	}
}
