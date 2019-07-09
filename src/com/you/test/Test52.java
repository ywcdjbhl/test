package com.you.test;
import java.io.PrintStream;
public class Test52 {
	public static void main(String[] args) {
		Integer i = 3;
		PrintStream err = System.err;
		err.println(i&i);
	}
}
