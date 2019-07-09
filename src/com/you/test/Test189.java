package com.you.test;
import java.net.URL;
public class Test189 {
	public static void main(String[] args) {
		Test189 test = new Test189();
		URL url = test.getClass().getClassLoader().getResource("com/you");
		System.out.println(url);
	}
}
