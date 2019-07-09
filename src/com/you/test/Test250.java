package com.you.test;
import java.io.PrintStream;
public class Test250 {
	public static void main(String[] args) {
		int i = Integer.MAX_VALUE;
		i = 2 * i;
		PrintStream err = System.err;
		err.println(i);
		
	}
}
