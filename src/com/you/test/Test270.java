package com.you.test;
import java.io.PrintStream;
public class Test270 {
	public static void main(String[] args) {
		Class<?> clazz = double[].class;
		Class<Double[]> clazz2 = Double[].class;
		PrintStream err = System.err;
		err.println(clazz);
		err.println(clazz2);
		
	}
}
