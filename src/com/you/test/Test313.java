package com.you.test;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
// 线索二叉树
public class Test313 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		int[] is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		Test313Tree tree = new Test313Tree(is);
		tree.getMin();
		tree.getLevelNum(63);
		tree.getLevelNum(71);
		tree.getLevelNum(1000);
		tree.getLevelNum(90);
		tree.inorderTraveral();
		tree.levelTraversal();
		tree.getWidthAndHeight();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {12};
		tree = new Test313Tree(is);
		tree.getMin();
		tree.getLevelNum(63);
		tree.getLevelNum(71);
		tree.getLevelNum(1000);
		tree.getLevelNum(90);
		tree.inorderTraveral();
		tree.levelTraversal();
		tree.getWidthAndHeight();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {13,14};
		tree = new Test313Tree(is);
		tree.getMin();
		tree.getLevelNum(63);
		tree.getLevelNum(71);
		tree.getLevelNum(1000);
		tree.getLevelNum(90);
		tree.inorderTraveral();
		tree.levelTraversal();
		tree.getWidthAndHeight();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {15,14};
		tree = new Test313Tree(is);
		tree.getMin();
		tree.getLevelNum(63);
		tree.getLevelNum(71);
		tree.getLevelNum(1000);
		tree.getLevelNum(90);
		tree.inorderTraveral();
		tree.levelTraversal();
		tree.getWidthAndHeight();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {};
		tree = new Test313Tree(is);
		tree.getMin();
		tree.getLevelNum(63);
		tree.getLevelNum(71);
		tree.getLevelNum(1000);
		tree.getLevelNum(90);
		tree.inorderTraveral();
		tree.levelTraversal();
		tree.getWidthAndHeight();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		tree = new Test313Tree(is);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		tree.delete(-1);
		tree.delete(77);
		tree.delete(42);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		tree.delete(140);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		tree = new Test313Tree(is);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		tree.delete(90);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		tree = new Test313Tree(is);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		tree.delete(61);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		tree = new Test313Tree(is);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		tree.delete(71);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		tree = new Test313Tree(is);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		tree.delete(63);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		tree = new Test313Tree(is);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		tree.delete(120);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		tree = new Test313Tree(is);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		tree.delete(200);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		tree = new Test313Tree(is);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		tree.delete(70);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		tree = new Test313Tree(is);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		tree.delete(60);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		err.println("-----------------");
		is = new int[] {200, 80, 1000, 60, 120, 140, 90, 40, 70, 61, 63, 64, 62, 71};
		tree = new Test313Tree(is);
		tree.inorderTraveral();		
		tree.levelTraversal();
		tree.traversal();
		tree.traversal2();
		tree.delete(80);
		tree.inorderTraveral();		
		tree.traversal();
		tree.traversal2();
	}
}

class Test313Node {
	int data;
	boolean leftThread = true; // 是否是线索,默认为true,当结点的左子结点或右子结点没有时,leftThread为true
	boolean rightThread = true;
	Test313Node left;
	Test313Node right;
	public Test313Node(int data) {
		this.data = data;
	}
}

class Test313Tree {
	private Test313Node boot;
	PrintStream err = System.err;
	public Test313Tree(int[] is) {
		for (int i : is) {
			this.add(i);
		}
	}
	public Test313Tree(int i) {
		this.add(i);
	}
	
	public void add(int i) {
		Test313Node prenode = null;
		if (this.boot == null) {
			this.boot = new Test313Node(i);
			return;
		}
		for (Test313Node node = this.boot;;) {
			if (node.data > i) {
				if (node.leftThread) {
					node.leftThread = false;
					prenode = node.left;
					node.left = new Test313Node(i);
					node.left.left = prenode;
					node.left.right = node;
					break;
				} else {
					node = node.left;
				}
			} else if (node.data < i) {
				if (node.rightThread) {
					node.rightThread = false;
					prenode = node.right;
					node.right = new Test313Node(i);
					node.right.right = prenode;
					node.right.left = node;
					break;
				} else {
					node = node.right;
				}
			} else {
				break;
			}
		}
	}

	public void delete(int i) {
		if (this.boot == null) {
			return;
		}
		Test313Node prenode = null;
		for (Test313Node node = this.boot;;) {
			if (node.data > i) {
				if (!node.leftThread) {
					prenode = node;
					node = node.left;	
				} else {
					break;
				}
			} else if (node.data < i) {
				if (!node.rightThread) {
					prenode = node;
					node = node.right;	
				} else {
					break;
				}
			} else {
				if (node.leftThread && node.rightThread) {
					// 叶子结点
					if (prenode.data > node.data) {
						// 左结点
						prenode.leftThread = true;
						prenode.left = node.left;
						node.left = null;
						node.right = null;
					} else if (prenode.data < node.data) {
						// 右结点
						prenode.rightThread = true;
						prenode.right = node.right;
						node.left = null;
						node.right = null;
					}
				} else if (!node.leftThread && node.rightThread) {
					// 只有左子结点
					if (prenode.data > node.data) {
						// 左子结点
						prenode.left = node.left;
						getRightest(node.left).right = node.right;
						node.left = null;
						node.right = null;
					} else if (prenode.data < node.data) {
						// 右子结点
						prenode.right = node.left;
						getRightest(node.left).right = node.right;
						node.left = null;
						node.right = null;
					}
				} else if (node.leftThread && !node.rightThread) {
					// 只有右子结点
					if (prenode.data > node.data) {
						// 左子结点
						prenode.left = node.right;
						getLeftest(node.right).left = node.left;
						node.left = null;
						node.right = null;
					} else if (prenode.data < node.data) {
						// 右子结点
						prenode.right = node.right;
						getLeftest(node.right).left = node.left;
						node.left = null;
						node.right = null;
					}
				} else {
					// 得到右子树的最左结点
					Test313Node node2 = node.right;
					Test313Node prenode2 = node;
					if (!node2.leftThread) {
						// 有左子结点
						for (;!node2.leftThread && node2.left != null;) {
							prenode2 = node2;
							node2 = node2.left;
						}
						node.data = node2.data;
						// 把node2删除
						if (!node2.rightThread) {
							// node2有右子结点
							prenode2.left = node2.right;
							getLeftest(node2.right).left = node2.left;
						} else {
							prenode2.leftThread = true;
							prenode2.left = node2.left;
							node2.left = null;
							node2.right = null;
						}
					} else {
						prenode2.data = node2.data;
						node.rightThread = true;
						node.right = node2.right;
						node2.left = null;
						node2.right = null;
					}
				}
				break;
			} 
		}
	}
	
	public void getMin() {
		if (this.boot == null) {
			err.println("Min:无");
			return;
		}
		Test313Node node = null;
		for (node = this.boot; node.left != null;) {
			node = node.left;
		}
		err.println("Min:" + node.data);
	}
	
	public void traversal() {
		String result = "线索正遍: ";
		if (this.boot == null) {
			err.println(result);
			return;
		}
		Test313Node node = getLeftest(this.boot);
		result = result + node.data + ", ";
		for (;;) {
			if (node.rightThread) {
				node = node.right;
				if (node == null) {
					break;
				}
				result = result + node.data + ", ";
			} else {
				node = node.right;
				node = getLeftest(node);
				result = result + node.data + ", ";
			}
		}
		err.println(result);
	}
	
	public void traversal2() {
		String result = "";
		if (this.boot == null) {
			err.println("线索倒遍: ");
			return;
		}
		Test313Node node = getRightest(this.boot);
		result = result + node.data + ", ";
		for (;;) {
			if (node.leftThread) {
				node = node.left;
				if (node == null) {
					break;
				}
				result = node.data + ", " + result;
			} else {
				node = node.left;
				node = getRightest(node);
				result = node.data + ", " + result;
			}
		}
		err.println("线索倒遍: " + result);
	}
	
	public Test313Node getLeftest(Test313Node node) {
		for (;!node.leftThread;) {
			node = node.left;
		}
		return node;
		
	}
	
	public Test313Node getRightest(Test313Node node) {
		for (;!node.rightThread;) {
			node = node.right;
		}
		return node;
		
	}
	
	public void inorderTraveral() {
		String result = "";
		Stack<Test313Node> stack = new Stack<Test313Node>();
		for (Test313Node node = this.boot;;) {
			if (node != null) {
				stack.push(node);
				if (!node.leftThread) {
					node = node.left;	
				} else {
					node = null;
				}
			} else {
				if (stack.isEmpty()) {
					err.println("中序遍历: " + result);
					break;
				}
				node = stack.peek();
				result = result + node.data + ", ";
				if (!node.rightThread) {
					node = node.right;	
				} else {
					node = null;
				}
				stack.pop();
			}
		}
	}
	
	public int getLevelNum(int i) {
		if (this.boot == null) {
			err.println(i + "的层数为: 0");
			return 0;
		}
		int num = 1;
		for (Test313Node node = this.boot;;) {
			if (node.data > i) {
				if (!node.leftThread) {
					node = node.left;	
					num ++;
				} else {
					err.println(i + "的层数为: 0");
					return 0;
				}
			} else if (node.data < i) {
				if (!node.rightThread) {
					node = node.right;	
					num ++;
				} else {
					err.println(i + "的层数为: 0");
					return 0;
				} 
			} else {
				err.println(i+ "的层数为:" + num);
				return num;
			}
		}
	}
	
	public void levelTraversal() {
		String result = "层序遍历: ";
		if (this.boot == null) {
			err.println(result);
			return;
		}
		result = result + this.boot.data + ", ";
		Queue<Test313Node> queue = new ArrayDeque<Test313Node>();
		for (Test313Node node = this.boot;;) {
			if (!node.leftThread) {
				// 有左子结点
				queue.add(node.left);
			}
			if (!node.rightThread) {
				// 有右子结点
				queue.add(node.right);
			}
			if (queue.isEmpty()) {
				err.println(result);
				break;
			}
			node = queue.poll();
			result = result + node.data + ", ";
		}
	}
	
	public void getWidthAndHeight() {
		String result = "每层结点数: 1, ";
		String dataStr = "";
		if (this.boot == null) {
			err.println("每层结点数: 0");
			err.println("高度: 0");
			return;
		}
		Queue<Test313Node> queue = new ArrayDeque<Test313Node>();
		queue.add(this.boot);
		dataStr = "( " + this.boot.data + "), (";
		int num = 1;
		int num2 = 0;
		int height = 1;
		for (Test313Node node;;) {
			node = queue.poll();
			num--;
			if (!node.leftThread) {
				queue.add(node.left);
				num2++;
				dataStr = dataStr + node.left.data + ", ";
			}
			if (!node.rightThread) {
				queue.add(node.right);
				dataStr = dataStr + node.right.data + ", ";
				num2++;
			}
			if (queue.isEmpty()) {
				err.println(result + dataStr);
				err.println("高度: " + height);
				break;
			}
			if (num == 0) {
				result = result + num2 + ", ";
				dataStr = dataStr + "), ("; 
				num = num2;
				num2 = 0;
				height++;
			}			
		}
	}
	
	public void getThreads() {
		
	}
	
}
