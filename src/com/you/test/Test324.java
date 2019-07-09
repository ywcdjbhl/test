package com.you.test;

import java.util.Stack;

public class Test324 {
	public static void main(String[] args) {
		Stack<Object> stack = new Stack<Object>();
		stack.push("no");
		stack.push(new Test324());
		stack.push(null);
		stack.push(Test324.class);
		for (Object obj : stack) {
			System.out.println(obj);
		}
	}
}
