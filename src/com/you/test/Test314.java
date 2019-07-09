package com.you.test;

import java.util.Stack;

public class Test314 {
	public static void main(String[] args) {
		Test314Tree tree = new Test314Tree();
		int[] is = {80099,	16114,	63108,	25032,	31044, 59069,	39099,	13110,	34101,	66120,19116,	72105, 70045,	38032,	41110,	12105,	75110,	27105,	1105, 9114,67117,	20101,	21100,	11032,	79046,	32112, 5111,	6117,	45116,	22032,61097,	65120,	49110, 15101,	82109,	50103,	54110,	17101,	46032,	4121,
				76097,	7032,	57105,	2102,	58044,	8097,	44099, 73064,	81111,	43097,30112,	14116,	60109,	74104, 77105,	35097,	64058,	29112,	55032,	33108,71108, 40111,	47088,	52117,	56076,	68097,	37101,	78114, 24110,	53097,69110,	48105,	18115,	26072,	3032, 42116,	62105,	51120,	28065,	10101,23105,	36115};
		tree.add(is);
		tree.inorderTraveral();
		// 80099, 81111, 82109
		char c = (char) 80099;
		System.err.println(c);
		c = (char) 81111;
		System.err.println(c);
		c = (char) 82109;
		System.err.println(c);
	}
}

class Test314Tree {
	Test314Node boot;
	public Test314Tree() {
		
	}
	
	public void add(int i) {
		Test314Node newnode = new Test314Node(i);
		if (this.boot == null) {
			this.boot = newnode;
			return;
		}
		Test314Node node = this.boot;
		for (;;) {
			if (node.data > i) {
				if (node.left == null) {
					node.left = newnode;
					break;
				} else {
					node = node.left;
				}
			} else if (node.data < i) {
				if (node.right == null) {
					node.right = newnode;
					break;
				} else {
					node = node.right;	
				}
			} else {
				break;
			}
		}
	}
	
	public void add(int[] is) {
		for (int i : is) {
			this.add(i);
		}
	}
	
	public void inorderTraveral() {
		String result = "中序遍历: ";
		Stack<Test314Node> stack = new Stack<Test314Node>();
		for (Test314Node node = this.boot;;) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				if (stack.isEmpty()) {
					System.err.println(result);
					break;
				}
				node = stack.peek();
				result = result + node.data + ", ";
				node = node.right;
				stack.pop();
			}
		}
	}
}

class Test314Node {
	int data;
	Test314Node left;
	Test314Node right;
	public Test314Node(int i) {
		this.data = i;
	}
}
