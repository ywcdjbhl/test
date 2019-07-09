package com.you.test;

public class Test60 {
	private int age;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void test(final Test60 test) {
		test.age= 1;
		test.setAge(-5);
	}
}
