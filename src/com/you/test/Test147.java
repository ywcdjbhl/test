package com.you.test;

public class Test147 {
	public static <P> P get(P p) {
		return p;
	}
	public static void main(String[] args) {
		Test147 test = new Test147();
		String hello = test.get("hell");
		System.out.println(hello);
		String word = Test147.get("word");
		System.out.println(word);
	}
}
