package com.you.test;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Test142 {
	public static void main(String[] args) {
		List<Test142> list = new LinkedList<Test142>();
		List<Test141> list2 = new LinkedList<Test141>();
		PrintStream err = System.err;
		Class clazz = list.getClass();
		Class clazz2 = list2.getClass();
		err.println(clazz == clazz2);
		
	}
}
