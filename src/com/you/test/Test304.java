package com.you.test;
import java.io.PrintStream;
public class Test304 {
	public static void main(String[] args) {
		int i = 1;
		int j = i << 30;
		PrintStream err = System.err;
		err.println(j);
		int k = i << 31;
		err.println(k);
		int l = i << 32;
		err.println(l);
	}
}
