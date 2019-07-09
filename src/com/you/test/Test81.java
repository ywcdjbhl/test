package com.you.test;
import java.io.PrintStream;
class Test81_2 {
	public Test81_2 left;
	public Test81_2 right;
	public Integer value;
}

public class Test81 {
	public Test81_2 top = new Test81_2();
	public Test81_2 checkLeft(Test81_2 test, int value) {
		if (test == null) {
			throw new NullPointerException();
		} else {
			Test81_2 left = test.left;
			if (left == null) {
				left = new Test81_2();
				left.value = value;
				return null;
			} else {
				return left;
			}
		}
	}
	public Test81_2 checkRight(Test81_2 test, int value) {
		if (test == null) {
			throw new NullPointerException();
		} else {
			Test81_2 right = test.right;
			if (right == null) {
				right = new Test81_2();
				right.value = value;
				return null;
			} else {
				return right;
			}
		}
	}
	public void add(int value) {
		if (top.value == null) {
			top.value = value;
		} else {
			Test81_2 test = top;
			while (test != null) {
				if (test.value > value) {
					test = checkRight(test, value);
				} else if (top.value < value) {
					test = checkLeft(test, value);
				} 
			}
		}
	}
	public int getMin() {
		Test81_2 test = this.top;
		while (test.left != null) {
			test = test.left;
		}
		return test.value;
	}
	public int getMax() {
		Test81_2 test = this.top;
		while (test.right != null) {
			test = test.right;
		}
		return test.value;
	}
	public static void main(String[] args) {
		PrintStream err = System.err;
		Test81 test = new Test81();
		test.add(1);
		test.add(3);
		test.add(3);
		test.add(-3);
		test.add(-13);
		test.add(23);
		err.println(test.getMin());
		err.println(test.getMax());
	}
}
