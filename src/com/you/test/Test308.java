package com.you.test;

import java.io.PrintStream;

public class Test308 {
	public static void main(String[] args) {
		char c = '\0';
		PrintStream err = System.err;
		err.println(c + 0);
		c = '\1';
		err.println(c + 0);
		c = '\2';
		err.println(c + 0);
		c = '\3';
		err.println(c + 0);
		c = '\4';
		err.println(c + 0);
		c = '\5';
		err.println(c + 0);
		c = '\6';
		err.println(c + 0);
		c = '\7';
		err.println(c + 0);
		c = '\10';
		err.println(c + 0);
		c = '\u000B';
		err.println(c + 0);
	}
}
