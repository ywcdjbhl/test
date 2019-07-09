package com.you.test;
import java.io.PrintStream;
public class Test271 {
	public static void main(String[] args) {
		Class clazz = Double.class;
		Class clazz2 = clazz.getComponentType();
		PrintStream err = System.err;
		err.println(clazz2);
		clazz = Double[].class;
		clazz2 = clazz.getComponentType();
		err.println(clazz2);
		clazz = Test271[][][].class;
		clazz2 = clazz.getComponentType();
		err.println(clazz2);
		
	}
}
