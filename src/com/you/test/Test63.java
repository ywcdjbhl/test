package com.you.test;
import java.io.PrintStream;
public class Test63 {
	public static void main(String[] args) {
		String s = Integer.toBinaryString(16);
		PrintStream err = System.err;
		err.println(s);
	}
}
