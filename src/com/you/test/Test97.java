package com.you.test;
import java.io.PrintStream;
public class Test97 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		String s = "vs7";
		String s2 = "";
		err.println(s.hashCode());
		err.println(s2.hashCode());
	}
}
