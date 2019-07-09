package com.you.test;
import java.io.PrintStream;
public class Test327 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		err.println(("Test" + "327") == ("Test" + "327"));
		String s = "Test";
		String s2 = "327";
		err.println((s + s2) == (s + s2));
		err.println((s + "327") == (s + "327"));
		err.println(("Test" + s2) == ("Test" + s2));
	}
}
