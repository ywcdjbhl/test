package com.you.test;
import java.io.PrintStream;
public class Test68 {
	public static void main(String[] args) {
		Test68[] test = new Test68[1];
		PrintStream err = System.err;
		err.println(test.getClass().getName());
		Object[] object = new Object[2];
		err.println(object.getClass().getName());
		err.println(object instanceof Object);
		err.println(test instanceof Object);
		Test68_2[] test2 = new Test68_2[1];
		err.println(test2 instanceof Test68[]);
		err.println(Object[].class.getName());
	}
}
class Test68_2 extends Test68 {
	
}
