package com.you.test;
import java.io.PrintStream;
public class Test130 {
	public String run() {
		PrintStream err = System.err;
		try {
			err.println("try");
			int i = 1 / 0;
			return "end";
		} catch (Exception e) {
			err.println("error");
			return "return";
		} finally {
			err.println("finally");
		}
	} 
	public static void main(String[] args) {
		Test130 test = new Test130();
		String s = test.run();
	}
	
}
