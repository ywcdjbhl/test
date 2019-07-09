package com.you.test;
import java.io.PrintStream;
public class Test89 {
	public static void main(String[] args) {
		Integer i = -5;
		String s = Integer.toBinaryString(i);
		PrintStream err = System.err;
		err.println(s);
		s = Integer.toBinaryString(Integer.MAX_VALUE);
		err.println(s);
		s = Integer.toBinaryString(-1);
		err.println(s);
	}
}
