package com.you.test;
import java.io.PrintStream;
public class Test48 {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(11);
		PrintStream err = System.err;
		err.println(i);
		String.valueOf(null);
	}
}
