package com.you.test;

import java.io.PrintStream;

public class Test279 {
	public static void main(String[] args) {
		String s = System.getProperty("file.separator");
		PrintStream err = System.err;
		err.println(s);
		s = System.getProperty("path.separator");
		err.println(s);
	}
}
