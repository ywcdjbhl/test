package com.you.test;
import java.io.PrintStream;
public class Test98 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		String s = "";
		String s2 = new String();
		String s3 = "aa" + "bb";
		String s4 = "aa";
		String s5 = s4 + "bb";
		int code = System.identityHashCode(s);
		err.println(code);
		int code2 = System.identityHashCode(s2);
		err.println(code2);
		int code3 = System.identityHashCode(s3);
		err.println(code3);
		int code5 = System.identityHashCode(s5);
		err.println(code5);
	}
}
