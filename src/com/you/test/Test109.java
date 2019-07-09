package com.you.test;

import java.util.Objects;

public class Test109 {
	public static void main(String[] args) {
		Integer i = new Integer(12);
		Integer i2 = new Integer(12);
		boolean flag = Objects.equals(i, i2);
		System.out.println(flag);
	}
}
