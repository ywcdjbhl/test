package com.you.test;
import java.io.PrintStream;
public class Test219 {
	public static void main(String[] args) {
		String s;
		int i;
		i = 127;
		s = Integer.toBinaryString(i);
		PrintStream err = System.err;
		err.println(i + "的二进制为:" + s);
		i = -127;
		s = Integer.toBinaryString(i);
		err.println(i + "的二进制为:" + s);
	}
}
