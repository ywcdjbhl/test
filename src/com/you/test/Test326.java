package com.you.test;

import java.io.PrintStream;

public class Test326 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		String s = "Test326";
		String s2 = "Tes" + "t" + "326";
		String s3 = "Tes";
		String s4 = "t";
		String s5 = "326";
		err.println(s.hashCode());
		err.println(s2.hashCode());
		err.println((s3 + s4 + s5).hashCode());
		err.println((s3 + "t" + "326").hashCode());
		err.println((s3 + "t326").hashCode());
		err.println((s3 + s4 + "326").hashCode());
		err.println("-------------------");
		err.println(System.identityHashCode(s));
		err.println(System.identityHashCode(s2));
		err.println(System.identityHashCode(s3 + s4 + s5));
		err.println(System.identityHashCode(s3 + "t" + "326"));
		err.println(System.identityHashCode(s3 + "t326"));
		err.println(System.identityHashCode(s3 + s4 + "326"));
		err.println(System.identityHashCode(s3 + s4 + "326"));
		err.println(System.identityHashCode(s3 + s4 + "326"));
		err.println(System.identityHashCode("Tes" + s4 + "326"));
		err.println(System.identityHashCode("Tes" + "t" + s5));
		err.println(System.identityHashCode("Tes" + 't' + s5));
		err.println(System.identityHashCode("Te" + "st" + s5));
		err.println(System.identityHashCode("T" + "e" + "st" + s5));
		err.println(System.identityHashCode("T" + "e" + "s" + "t" + s5));
		err.println(System.identityHashCode("T" + 'e' + 's' + 't' + s5));
	}
}
