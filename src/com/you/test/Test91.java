package com.you.test;
import java.io.PrintStream;
public class Test91 {
	public static void main(String[] args) {
		int i = 4;
		i = i >> 0;
		PrintStream err = System.err;
		err.println(i);
	}
}
