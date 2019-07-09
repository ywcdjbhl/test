package com.you.test;
import java.io.PrintStream;
public class Test93 {
	public static void main(String[] args) {
		int i = 0x80000000;
		PrintStream err = System.err;
		err.println(i);
	}
}
