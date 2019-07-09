package com.you.test;
import java.io.PrintStream;
public class Test84 {
	public static void main(String[] args) {
		int i = 18;
		i = i >> 3;
		PrintStream err = System.err;
		err.println(i);
	}
}
