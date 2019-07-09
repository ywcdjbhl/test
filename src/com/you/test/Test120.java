package com.you.test;

public class Test120 {
	private Integer age;
	public Test120 () {
		this(4);
	}
	public Test120(Integer age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Test120 test = new Test120();
		System.out.println(test.age);
	}
}
