package com.you.test;

import java.io.PrintStream;

public class Test178 {
	static char c;
	public static void main(String[] args) {
		PrintStream err = System.err;
		err.println(c == 0);
	}
}
