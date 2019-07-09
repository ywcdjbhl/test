package com.you.test;
import java.io.PrintStream;
public class Test269 {
	public static void main(String[] args) {
		Class<Object> clazz = Object.class;
		PrintStream err = System.err;
		err.println(clazz);
		Class clazz2 = clazz.getClass();
		err.println(clazz2);
		Class clazz3 = clazz2.getClass();
		err.println(clazz2 == clazz3);
	}
}
