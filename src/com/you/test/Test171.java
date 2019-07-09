package com.you.test;

import java.io.PrintStream;

public class Test171 {
	public static void main(String[] args) {
		String s = "jiang";
		PrintStream err = System.err;err.println(s.startsWith("iang",1));
	}
}
