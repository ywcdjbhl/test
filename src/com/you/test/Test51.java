package com.you.test;
import java.io.PrintStream;
public class Test51 {
	public static void main(String[] args) {
		int i = 2;
		i = i << 2;
		PrintStream err = System.err;
		err.println(i);
	}
}
