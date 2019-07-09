package com.you.test;
import java.io.PrintStream;
public class Test247 {
	public static void main(String[] args) {
		int i = Character.forDigit('9', 10);
		PrintStream err = System.err;
		err.println(i);
	}
}
