package com.you.test;

public class Test212 {
	public static void main(String[] args) {
		char c = '\uD800';
		System.out.println(c);
		c = '\uDFFF';
		System.out.println(c);
		int i = 0x010000;
		System.out.println(i);
		c = (char)i;
		System.out.println(c);
		
	}
}
