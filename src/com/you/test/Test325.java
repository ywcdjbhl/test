package com.you.test;

public class Test325 {
	public static void main(String[] args) {
		String s = "Test325";
		System.err.println(s.hashCode());
		System.err.println(System.identityHashCode(s));
		String s2 = s;
		System.err.println(s2.hashCode());
		System.err.println(System.identityHashCode(s2));
		String s3 = "Test" + "325";
		System.err.println(s3.hashCode());
		System.err.println(System.identityHashCode(s3));
		String s4 = "Test";
		String s5 = s4 + "325";
		System.err.println(s5.hashCode());
		System.err.println(System.identityHashCode(s5));
		String s6 = "325";
		String s7 = "Test" + s6;
		System.err.println(s7.hashCode());
		System.err.println(System.identityHashCode(s7));
	}
}
