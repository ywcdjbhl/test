package com.you.test;

import java.io.PrintStream;

public class Test284 {
	public static void main(String[] args) {
		Test284_2 test = new Test284_2() {
			public void play() {
				PrintStream err = System.err;
				err.println("内部类");
				err.println(this);
				err.println(this.getClass().getName());
			}
		};
		test.play();
		test = new Test284_2() {
			public void play() {
				PrintStream err = System.err;
				err.println("内部类");
				err.println(this);
				err.println(this.getClass().getName());
			}
		};
		test.play();
	}
}

interface Test284_2 {
	public void play();
}