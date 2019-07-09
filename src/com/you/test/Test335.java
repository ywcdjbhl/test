package com.you.test;
import java.io.PrintStream;
public class Test335 {
	@Override
	public int hashCode() {
		return 33000;
	}
	
	public static void main(String[] args) {
		PrintStream err = System.err;
		Test335 test = new Test335();
		err.println(test);
		err.println(test.hashCode());
	}
	
}
