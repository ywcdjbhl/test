package com.you.test;
import java.io.PrintStream;
public class Test334 {
	public static void main(String[] args) {
		String s = "hellowode";
		PrintStream err = System.err;
		err.println(s.hashCode());
		err.println(System.identityHashCode(s));
		String s2 = new String("hellowode");
		err.println(s2.hashCode());
		err.println(System.identityHashCode(s2));
	}
}
