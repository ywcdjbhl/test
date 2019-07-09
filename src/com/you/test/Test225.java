package com.you.test;
import java.io.PrintStream;
public class Test225 {
	public static void main(String[] args) {
		String s = "helloword";
		String s2 = "ello";
		boolean flag = s.regionMatches(false, 1, s2, 0, 4);
		PrintStream err = System.err;
		err.println(flag);
	}
}
