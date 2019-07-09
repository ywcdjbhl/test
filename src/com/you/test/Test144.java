package com.you.test;

public class Test144<T> {
	private T m;
	public void setM (T m) {
		this.m = m;
	}
	public T getM() {
		return this.m;
	}
	public static void main(String[] args) {
		Test144<Test144> test = new Test144<Test144>();
		test.setM(new Test144());
		Test144 test2 = test.getM();
	}
	
}
