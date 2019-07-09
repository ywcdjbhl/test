package com.you.test;
import java.io.PrintStream;
public class Test47 {
	public static void main(String[] args) {
		String str = "2017-10-11";
		String str2 = "2017-10-17";
		PrintStream err = System.err;
		err.println(str.compareTo(str2));
	}
}
