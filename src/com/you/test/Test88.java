package com.you.test;
import java.io.PrintStream;
public class Test88 {
	public static void main(String[] args) {
		int i = -64;
		PrintStream err = System.err;
		i = i >>> 3;
		err.println(i);
	}
}
