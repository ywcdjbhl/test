package com.you.test;
import java.io.PrintStream;
public class Test209 {
	public static void main(String[] args) {
		int a = 'A';
		PrintStream err = System.err;
		err.println(a);
		int b = 'a';
		err.println(b);
		int c = '0';
		err.println(c);
			
	}
}
