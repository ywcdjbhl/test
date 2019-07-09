package com.you.test;

import java.io.PrintStream;

public class Test162 {
	public static void main(String[] args) {
		ClassLoader cl = Test162.class.getClassLoader();
		PrintStream err = System.err;
		err.println(cl);
		ClassLoader cl2 = Class.class.getClassLoader();
		err.println(cl2);
		ClassLoader cl3 = Object.class.getClassLoader();
		err.println(cl3);
	}
}
