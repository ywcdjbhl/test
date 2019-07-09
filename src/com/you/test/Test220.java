package com.you.test;

import java.io.PrintStream;

public class Test220 {
	public static void main(String[] args) {
		byte b = -127;
		PrintStream out = System.out;
		out.println(b);
		int c = b & 255;
		out.println(c);
	}
}
