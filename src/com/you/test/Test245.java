package com.you.test;
import java.io.PrintStream;
public class Test245 {
	public static void main(String[] args) {
		char[] c = new char[] {'3', 'e', 'c',   'o' ,};
		PrintStream err = System.err;
		for (int i = 0; i < c.length; i++) {
			err.println(c[i]);	
		}
	}
}
