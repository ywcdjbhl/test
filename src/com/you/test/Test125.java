package com.you.test;
import java.io.PrintStream;
public class Test125 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		Object i = null;
		String s = null;
		Test125 test = null;
		err.println(i == s);
		err.println(test == i);
	}
}
