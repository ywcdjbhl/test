package com.you.test;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// 检查是否平衡二叉树,不线索
public class Test322 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		int[] is = new int[] {};
		Test322Tree tree = new Test322Tree();
		tree.add(is);
		boolean flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {81};
		tree = new Test322Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {1,2};
		tree = new Test322Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {1,2,0};
		tree = new Test322Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {1,2,3};
		tree = new Test322Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		tree = new Test322Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71, 1002};
		tree = new Test322Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
	}
	
}

class Test322Node {
	Test322Node left;
	Test322Node right;
	int data;
	public Test322Node(int i) {
		data = i;
	}
}

class Test322Tree {
	Test322Node boot;
	PrintStream err = System.err;
	boolean isBalance() {
		if (this.boot == null) {
			return true;
		}
		List<Integer> list = new ArrayList<Integer>();
		Queue<Test322Node> queue = new ArrayDeque<Test322Node>();
		queue.add(this.boot);
		for (Test322Node node;;) {
			node = queue.poll();
			int factor = getFactor(node);
			if (factor > 1) {
				list.add(node.data);
			}
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
			if (queue.isEmpty()) {
				break;
			}
		}
		if (list.size() > 0) {
			err.println("不平衡: " + list);
			return false;
		}
		return true;
	}
	
	int getHeight(Test322Node node) {
		if (node == null) {
			return 0;
		}
		Queue<Test322Node> queue = new ArrayDeque<Test322Node>();
		queue.add(node);
		int height = 1;
		int num = 1;
		int num2 = 0;
		for (;;) {
			node = queue.poll();
			num--;
			if (node.left != null) {
				queue.add(node.left);		
				num2++;
			}
			if (node.right != null) {
				queue.add(node.right);
				num2++;
			}
			if (queue.isEmpty()) {
				break;
			}
			if (num == 0) {
				num = num2;
				num2 = 0;
				height++;
			}
		}
		return height;
	}
	
	int getFactor(Test322Node node) {
		if (node == null) {
			return 0;
		}
		int factor = getHeight(node.left) - getHeight(node.right);
		if (factor < 0) {
			factor = -factor;
		}
		return factor;
	}
	
	public void add(int[] is) {
		for (int i : is) {
			add(new Test322Node(i));
		}
	}
	
	public void add(Test322Node node) {
		if (this.boot == null) {
			this.boot = node;
			return;
		}
		for (Test322Node prenode = this.boot;;) {
			if (node.data > prenode.data) {
				if (prenode.right == null) {
					prenode.right = node;
					break;
				} else {
					prenode = prenode.right;
				}
			} else if (node.data < prenode.data) {
				if (prenode.left == null) {
					prenode.left = node;
					break;
				} else {
					prenode = prenode.left;
				}
			} else {
				break;
			}
		}
	}
	
	public void levelTraversal() {
		String result = "层序遍历: ";
		if (this.boot == null) {
			err.println(result);
			return;
		}
		Queue<Test322Node> queue = new ArrayDeque<Test322Node>();
		queue.add(this.boot);
		for (Test322Node node; !queue.isEmpty();) {
			node = queue.poll();
			result = result + node.data + ", ";
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		err.println(result);
	}
}
