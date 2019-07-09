package com.you.test;

public class Test302 {
	public static void main(String[] args) {
		String src = "2222222222222";
		char[] dst = new char[2];
		src.getChars(0, 2, dst, 2);
	}
}
