package com.you.test;
import java.io.PrintStream;

public class Test234 {
	public static void main(String[] args) {
		String[] ss = new String[0];
		Class<?> clazz = ss.getClass();
		String[] ss2 = new String[3];
		Class<?> clazz2 = ss2.getClass();
		PrintStream err = System.err;
		err.println(clazz == clazz2);
		Class<?> clazz3 = new String[8].getClass();
		err.println(clazz == clazz3);
		Class<?> clazz4 = String.class;
		err.println(clazz == clazz4);
		Class<?> clazz5 = String[].class;
		err.println(clazz == clazz5);
		Class<?> clazz6 = String[][].class;
		err.println(clazz6);
		err.println("-----------------");
		Test234[] tt = new Test234[0];
		Class<?> clazz7 = tt.getClass();
		Test234[] tt2 = new Test234[3];
		Class<?> clazz8 = tt2.getClass();
		err.println(clazz7 == clazz8);
		Class<?> clazz9 = new Test234[8].getClass();
		err.println(clazz7 == clazz9);
		Class<?> clazz10 = Test234.class;
		err.println(clazz7 == clazz10);
		Class<?> clazz11 = Test234[].class;
		err.println(clazz7 == clazz11);
		Class<?> clazz12 = Test234[][].class;
		err.println(clazz12);
	}
}
