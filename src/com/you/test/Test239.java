package com.you.test;
import java.io.PrintStream;
public class Test239 {
	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		PrintStream err = System.err;
		err.println(i);
		i = -i;
		err.println(i);
		for (;;) {
			i = -i;
			err.println(i);	
		}
	}
}
