package com.you.test;

import java.io.PrintStream;

public class Test229 {
	public static void main(String[] args) throws Exception {
		new Test229_2(); 
		Thread.sleep(3000);
		new Test229_2(); 
	}
}
class Test229_2 {
	
	private static int i = 3; 
	private static int i2 = getNumber();
	private String s = getString();
	private int i4 = getNumber();
	private double d = getDouble();
	static {
		PrintStream err = System.err;
		err.println("TEST299_2静态块    i=" + i + " i2=" + i2);
	}
	public static int getNumber() {
		System.err.println("调用方法getNumber()");
		return 47;
	}
	public String getString() {
		System.err.println("调用方法getString()");
		return "hello";
	}
	public double getDouble() {
		System.err.println("调用方法getDouble()");
		return 5.1D;
	}
}
