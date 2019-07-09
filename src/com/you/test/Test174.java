package com.you.test;
import java.io.PrintStream;
public class Test174 {
	public static void main(String[] args) {
		Integer i = null;
		PrintStream out = System.err;
		Integer i2= 5;
		out.println(i == i2);
		out.println(i == i2.intValue());
		out.println(i == 7);
	}
}
