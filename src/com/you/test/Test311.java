package com.you.test;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// 二叉排序树
public class Test311 {
	public static void main(String[] args) {
		Test311Tree tree = new Test311Tree();
		int[] is = new int[] {};
		tree.add(is);
		tree.preorderTraversal();
		tree.inorderTraversal();
		tree.postorderTraveral();
		tree.levelorderTraversal();
		tree.getMin();
		tree.getMax();
		tree.size();
		System.err.println(tree.exist(6));
		System.err.println("----------------------");
		tree = new Test311Tree();
		is = new int[] {9};
		tree.add(is);
		tree.preorderTraversal();
		tree.inorderTraversal();
		tree.postorderTraveral();
		tree.levelorderTraversal();
		tree.getMin();
		tree.getMax();
		tree.size();
		System.err.println(tree.exist(6));
		System.err.println(tree.exist(9));
		System.err.println("----------------------");
		tree = new Test311Tree();
		is = new int[] {8, 3, 10, 1, 6, 4, 7, 14, 13};
		tree.add(is);
		tree.preorderTraversal();
		tree.inorderTraversal();
		tree.postorderTraveral();
		tree.levelorderTraversal();
		tree.getMin();
		tree.getMax();
		tree.size();
		System.err.println(tree.exist(9));
		System.err.println(tree.exist(7));
		System.err.println(tree.exist(-1));
		System.err.println(tree.exist(11));
		System.err.println("----------------------");
		tree = new Test311Tree();
		is = new int[] {8, 3, 10, 1, 6, 4, 7, 14, 13};
		tree.add(is);
		tree.delete(1);
		tree.levelorderTraversal();
		System.err.println("----------------------");
		tree = new Test311Tree();
		is = new int[] {8, 3, 10, 1, 6, 4, 7, 14, 13};
		tree.add(is);
		tree.delete(4);
		tree.levelorderTraversal();
		System.err.println("----------------------");
		tree = new Test311Tree();
		is = new int[] {8, 3, 10, 1, 6, 4, 7, 14, 13};
		tree.add(is);
		tree.delete(7);
		tree.levelorderTraversal();
		System.err.println("----------------------");
		tree = new Test311Tree();
		is = new int[] {8, 3, 10, 1, 6, 4, 7, 14, 13};
		tree.add(is);
		tree.delete(13);
		tree.levelorderTraversal();
		System.err.println("----------------------");
		tree = new Test311Tree();
		is = new int[] {8, 3, 10, 1, 6, 4, 7, 14, 13};
		tree.add(is);
		tree.delete(6);
		tree.levelorderTraversal();
		System.err.println("----------------------");
		tree = new Test311Tree();
		is = new int[] {8, 3, 10, 1, 6, 4, 7, 14, 13};
		tree.add(is);
		tree.delete(3);
		tree.levelorderTraversal();
		System.err.println("----------------------");
		tree = new Test311Tree();
		is = new int[] {200, 80, 1000, 60, 120, 90, 140, 70, 40, 61, 62, 63, 64};
		tree.add(is);
		tree.delete(80);
		tree.levelorderTraversal();
	}
}

class Test311Node {
	int data;
	Test311Node left;
	Test311Node right;
	public Test311Node(int data) {
		this.data = data;
	}
}

// for循环
class Test311Tree {
	PrintStream err = System.err;
	// 根节点
	private Test311Node boot;
	// 新增节点
	public void add(Test311Node node) {
		Test311Node nownode;
		Test311Node prenode;
		if (this.boot == null) {
			this.boot = node;
			return;
		}
		for (nownode = this.boot; nownode != null; ) {
			prenode = nownode;
			if (nownode.data > node.data) {
				nownode = nownode.left;
				if (nownode == null) {
					prenode.left = node;
				}
			} else if (nownode.data < node.data) {
				nownode = nownode.right;
				if (nownode == null) {
					prenode.right = node;
				}
			} else {
				break;
			}
		}
	}
	
	public void add(int i) {
		this.add(new Test311Node(i));
	}
	
	public void add(int[] is) {
		for (int i : is) {
			Test311Node node = new Test311Node(i);
			add(node);
		} 
	}
	
	public void preorderTraversal() {
		String result = "";
		Stack<Test311Node> stack = new Stack<Test311Node>();
		for (Test311Node node = this.boot; ;) {
			if (node != null) {
				stack.push(node);
				result = result + node.data + ",";
				node = node.left;
			} else {
				if (stack.isEmpty()) {
					break;
				}
				node = stack.peek();
				node = node.right;
				stack.pop();
			}
		}
		err.println("前序遍历: " + result);
	}
	
	public void inorderTraversal() {
		String result = "";
		Stack<Test311Node> stack = new Stack<Test311Node>();
		for (Test311Node node = this.boot;;) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				if (stack.isEmpty()) {
					err.println("中序遍历: " + result);
					break;
				}
				node = stack.peek();
				result = result + node.data + ",";
				node = node.right;
				stack.pop();
			}
		}
	}
	
	public void postorderTraveral() {
		String result = "后序遍历: ";
		Stack<Test311Node> stack = new Stack<Test311Node>();
		Stack<Test311Node> output = new Stack<Test311Node>();
		for (Test311Node node = this.boot; ;) {
			if (node != null) {
				stack.push(node);
				output.push(node);
				node = node.right;
			} else {
				if (stack.isEmpty()) {
					while (!output.isEmpty()) {
						result = result + output.pop().data + ", ";
					}
					err.println(result);
					break;
				}
				node = stack.peek();
				node = node.left;
				stack.pop();
			}
		}
	}
	
	public void levelorderTraversal() {
		String result = "";
		if (this.boot == null) {
			err.println("层序遍历: " + result);
			return;
		}
		Queue<Test311Node> list = new LinkedList<Test311Node>();
		list.add(this.boot);
		for (Test311Node node = this.boot;;) {
			node = list.poll();
			result = result + node.data + ", "; 
			if (node.left != null) {
				list.add(node.left);
			}
			if (node.right != null) {
				list.add(node.right);
			}
			if (list.isEmpty()) {
				err.println("层序遍历: " + result);
				break;
			}
		}
	}
	
	public void getMin() {
		if (this.boot == null) {
			err.println("最小值:无");
			return;
		}
		for (Test311Node node = this.boot;;) {
			if (node.left != null) {
				node = node.left;
			} else {
				err.println("最小值: " + node.data);
				break;
			}
		}
	}
	
	public void getMax() {
		if (this.boot == null) {
			err.println("最大值:无");
			return;
		}
		for (Test311Node node = this.boot;;) {
			if (node.right != null) {
				node = node.right;
			} else {
				err.println("最大值: " + node.data);
				break;
			}
		}
	}
	
	public boolean exist(int i) {
		for (Test311Node node = this.boot;;) {
			if (node == null) {
				return false;
			}
			if (node.data > i) {
				node = node.left;
			} else if (node.data < i) {
				node = node.right;
			} else {
				return true;
			}
		}
	}
	
	public boolean delete(int i) {
		Test311Node prenode = null;
		for (Test311Node node = this.boot;;) {
			if (node == null) {
				return false;
			}
			if (node.data > i) {
				prenode = node;
				node = node.left;
			} else if (node.data < i) {
				prenode = node;
				node = node.right;
			} else {
				if (node.left == null && node.right ==null) {
					// 叶子结点
					if (prenode.data > node.data) {
						prenode.left = null;
					} else if (prenode.data < node.data) {
						prenode.right = null;
					}
				} else if (node.left == null && node.right != null) {
					if (prenode.data > node.data) {
						prenode.left = node.right;
					} else if (prenode.data < node.data) {
						prenode.right = node.right;
					}
				} else if (node.right == null && node.left != null) {
					if (prenode.data > node.data) {
						prenode.left = node.left;
					} else if (prenode.data < node.data) {
						prenode.right = node.left;
					}
				} else {
					Test311Node prenode2 = node;
					Test311Node node2 = node.left;
					if (node2.right == null) {
						node.data = node.left.data;
						node.left = node2.left;
						return true;
					}
					for (;node2.right != null;) {
						prenode2 = node2;
						node2 = node2.right;
					}
					prenode2.right = node2.left;
					node.data = node2.data;
				}
				return true;
			}
		}
	}
	
	public void size() {
		Stack<Test311Node> stack = new Stack<Test311Node>();
		int size = 0;
		for (Test311Node node = this.boot; !(stack.isEmpty() && node == null);) {
			if (node != null) {
				stack.push(node);
				node = node.left;
				size ++;
			} else {
				node = stack.peek();
				node = node.right;
				stack.pop();
			}
		}
		err.println("size = " + size);
	}
	
	
}