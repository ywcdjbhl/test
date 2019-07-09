package com.you.test;
import java.io.PrintStream;
public class Test303 {
	private int age;
	private int grade;
	public Test303(int age, int grade) {
		this.age = age;
		this.grade = grade;
	}
	public int hashCode2() {
		return this.age * this.grade;
	}
	public static void main(String[] args) {
		Test303 test = new Test303(4,5);
		Test303 test2 = new Test303(6,5);
		Test303 test3 = new Test303(8,11);
		PrintStream err = System.err;
		err.println(test.hashCode());
		err.println(test2.hashCode());
		err.println(test3.hashCode());
		err.println("---------------");
		err.println(System.identityHashCode(test));
		err.println(System.identityHashCode(test2));
		err.println(System.identityHashCode(test3));
	}
}
