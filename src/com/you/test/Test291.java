package com.you.test;

import java.io.PrintStream;

public class Test291 {
	public static void main(String[] args) {
		Class clazz = sun.reflect.Reflection.getCallerClass();
		PrintStream err = System.err;
		err.println(clazz);
	}
}
