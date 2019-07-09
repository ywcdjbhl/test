package com.you.test;
import java.io.PrintStream;
public class Test55 {
	public static void main(String[] args) {
		int i = 9;
		PrintStream err = System.err;
		err.println(null instanceof Integer);
		err.println(new Integer(19).equals(19));
		Integer i2 = null;
		err.println(new Integer(39).equals(i2));
		Integer i3 = new Integer(49);
		err.println(i3 == 49);
		
	}
}
