package com.you.test;
import java.io.PrintStream;
public class Test135 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		String s = "2322222222";
		err.println(s.matches("^\\d+$"));
		Long.valueOf(s);
		err.println('0' > '-');
		err.println('0' > '-');
		int x=Character.digit('c', 16);
		err.println("x="+x);
	}
}
