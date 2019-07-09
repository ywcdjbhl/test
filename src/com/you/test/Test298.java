package com.you.test;
import java.io.PrintStream;
public class Test298 {
	public static void main(String[] args) {
//		Test298_2.values();
		Class cl = Test298_2.class;
		float f = Test298_2.f;
		Class calzz = Test298_3.class;
		int i = Test298_3.i;
	}
}

enum Test298_2 {
	HELLO,
	WORLD;
	PrintStream err = System.err;
	static float f;
	static {
		System.err.println("Test298_2静态块");
	}
	Test298_2() {
		err.println("Test298_2构造方法" + this);
	}
}

class Test298_3 {
	static int i;
	static {
		System.err.println("Test298_3静态块");
	}
	public Test298_3() {
		System.err.println("Test298_3构造方法");
	}
	public static void eat() {}
}