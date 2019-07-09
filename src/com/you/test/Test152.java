package com.you.test;

public class Test152 {
	public static void main(String[] args) {
		String s= "636F6D2F746573742F54657374";
		char[] cs = s.toCharArray();
		for (char c : cs) {
			String str = Integer.toHexString(c);	
			System.out.println(str);
			s += str;
		}
		System.out.println(s);
	}
}
