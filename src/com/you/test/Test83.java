package com.you.test;
import java.io.PrintStream;
public class Test83 {
	public static void main(String[] args) {
		int i = -33;
		PrintStream err = System.err;
		err.println(~i);
	}
}
