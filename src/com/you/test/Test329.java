package com.you.test;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Test329 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		int[] is = new int[] {3, 2, 1};
		Test329Tree tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
		err.println("--------------------");
		is = new int[] {7, 5, 10, 3, 6, 9, 11, 2, 4, 8, 12, 1};
		tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
		err.println("--------------------");
		is = new int[] {6, 3, 11, 2, 4, 9, 12, 1, 5, 8, 10, 7};
		tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
		err.println("--------------------");
		is = new int[] {1, 2, 3};
		tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
		err.println("--------------------");
		is = new int[] {6, 3, 8, 2, 4, 7, 10, 1, 5, 9, 11, 12};
		tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
		err.println("--------------------");
		is = new int[] {7, 2, 10, 1, 4, 9, 11, 3, 5, 8, 12, 6};
		tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
		err.println("--------------------");
		is = new int[] {8, 3, 9 ,2, 6, 10, 1, 5, 7, 4};
		tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
		err.println("--------------------");
		is = new int[] {11, 8, 14, 3, 9, 13, 15, 2, 6, 10, 12, 16, 1, 5, 7, 4};
		tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
		err.println("--------------------");
		is = new int[] {6, 3, 14, 2, 4, 9, 15, 1, 5, 8, 12, 16, 7, 11, 13, 10};
		tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
		err.println("--------------------");
		is = new int[] {3, 2, 8, 1, 6, 9, 5, 7, 10, 4};
		tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
		err.println("--------------------");
		is = new int[] {11, 3, 14, 2, 8, 13, 15, 1, 6, 9, 12, 16, 5, 7, 10, 4};
		tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
		err.println("--------------------");
		is = new int[] {6, 3, 9, 2, 4, 8, 14, 1, 5, 7, 12, 15, 11, 13, 16, 10};
		tree = new Test329Tree();
		tree.add(is);
		tree.levelTraversal();
		tree.isBalance();
	}
}

class Test329Node {
	int data;
	Test329Node left;
	Test329Node right;
	public Test329Node(int i) {
		data = i;
	}
}
class Test329Tree {
	Test329Node boot;
	PrintStream err = System.err;
	public void add(Test329Node newnode) {
		if (this.boot == null) {
			this.boot = newnode;
			return;
		}
		Test329Node prenode;
		for (Test329Node node = this.boot;;) {
			if (newnode.data > node.data) {
				prenode = node;
				node = node.right;
				if (node == null) {
					prenode.right = newnode;
					break;
				}
			} else if (newnode.data < node.data) {
				prenode = node;
				node = node.left;
				if (node == null) {
					prenode.left = newnode;
					break;
				}
			} else {
				break;
			}
		}
	}
	
	public void add(int[] is) {
		for (int i : is) {
			Test329Node node = new Test329Node(i);
			add(node);
			totate(node);
		}
	}
	
	public void totate(Test329Node newnode) {
		Test329Node lownode = getLownode(newnode);
		if (lownode == null) {
			return;
		}
		if (lownode.data > newnode.data) {
			Test329Node node = lownode.left;
			if (node.data > newnode.data) {
				// 新增结点位于最低不平衡结点的左子结点的左子树
				if (lownode == this.boot) {
					// 最低平衡结点是根结点
					Test329Node temp = this.boot;
					this.boot = this.boot.left;
					temp.left = this.boot.right;
					this.boot.right = temp;
				} else {
					// 最低不平衡结点不是根结点
					Test329Node father = getFather(lownode);
					if (father.data > lownode.data) {
						father.left = lownode.left;
						lownode.left = father.left.right;
						father.left.right = lownode;
					} else if (father.data < lownode.data) {
						father.right = lownode.left;
						lownode.left = father.right.right;
						father.right.right = lownode;
					}
				}
			} else if (node.data < newnode.data) {
				// 新增结点位于最低不平衡结点的左结点的右子树
				if (lownode == this.boot) {
					Test329Node temp = lownode.left;
					lownode.left = lownode.left.right;
					temp.right = lownode.left.left;
					lownode.left.left = temp;
					
					temp = this.boot;
					this.boot = lownode.left;
					temp.left = this.boot.right;
					this.boot.right = temp;
				} else {
					Test329Node father = getFather(lownode);
					if (father.data > lownode.data) {
						Test329Node temp = lownode.left;
						lownode.left = lownode.left.right;
						temp.right = lownode.left.left;
						lownode.left.left = temp;
						
						temp = lownode;
						father.left = lownode.left;
						lownode.left = father.left.right;
						father.left.right = temp;
					} else if (father.data < lownode.data) {
						Test329Node temp = lownode.left;
						lownode.left = lownode.left.right;
						temp.right = lownode.left.left;
						lownode.left.left = temp;
						
						father.right = lownode.left;
						lownode.left = father.right.right;
						father.right.right = lownode;
					}
				}
			}
		} else if (lownode.data < newnode.data) {
			if (lownode.right.data < newnode.data) {
				// 新增结点位于最低不平衡结点的右子结点的右子树
				if (lownode == this.boot) {
					Test329Node temp = this.boot;
					this.boot = this.boot.right;
					temp.right = this.boot.left;
					this.boot.left = temp;
				} else {
					Test329Node father = getFather(lownode);
					if (father.data < lownode.data) {
						father.right = lownode.right;
						lownode.right = father.right.left;
						father.right.left = lownode;
					} else if (father.data > lownode.data) {
						father.left = lownode.right;
						lownode.right = father.left.left;
						father.left.left = lownode;
					}
				}	
			} else if (lownode.right.data > newnode.data) {
				// 新增结点位于最低不平衡结点右子结点的左子树
				if (lownode == this.boot) {
					Test329Node temp = this.boot.right;
					this.boot.right = this.boot.right.left;
					temp.left = this.boot.right.right;
					this.boot.right.right = temp;
					
					temp = this.boot;
					this.boot = this.boot.right;
					temp.right = this.boot.left;
					this.boot.left = temp;
				} else {
					Test329Node father = getFather(lownode);
					if (father.data > lownode.data) {
						Test329Node temp = lownode.right;
						lownode.right = lownode.right.left;
						temp.left = lownode.right.right;
						lownode.right.right = temp;
						
						temp = father.left;
						father.left = father.left.right;
						temp.right = father.left.left;
						father.left.left = temp;
					} else if (father.data < lownode.data) {
						Test329Node temp = lownode.right;
						lownode.right = lownode.right.left;
						temp.left = lownode.right.right;
						lownode.right.right = temp;
						
						temp = father.right;
						father.right = father.right.right;
						temp.right = father.right.left;
						father.right.left = temp;
					}
				}
			}
		}
	}

	// 由新插入结点得到最低不平衡结点
	public Test329Node getLownode(Test329Node newnode) {
		Stack<Test329Node> stack = new Stack<Test329Node>();
		for (Test329Node node = this.boot;;) {
			boolean bal = isBalance(node);
			if (!bal) {
				stack.push(node);
			}
			if (node.data > newnode.data) {
				node = node.left;
			} else if (node.data < newnode.data) {
				node = node.right;
			} else {
				if (stack.isEmpty()) {
					return null;
				} else {
					node = stack.peek();
					return node;	
				}
			}
		}
	}

	// 得到父结点
	public Test329Node getFather(Test329Node node2) {
		Test329Node father = null;
		for (Test329Node node = this.boot;;) {
			if (node.data > node2.data) {
				father = node;
				node = node.left;
			} else if (node.data < node2.data) {
				father = node;
				node = node.right;
			} else {
				return father;
			}
		}
	}
	
	// 结点是否平衡
	public boolean isBalance(Test329Node node) {
		int factor = getFactor(node);
		if (factor == 0 || factor == -1 || factor == 1) {
			return true;
		} 
		return false;
	}
	
	// 树是否平衡
	public void isBalance() {
		Stack<Test329Node> stack = new Stack<Test329Node>();
		PrintStream err = System.err;
		List<Integer> list = new ArrayList<Integer>();
		for (Test329Node node = this.boot;;) {
			if (node != null) {
				boolean isbal = isBalance(node);
				if (!isbal) {
					list.add(node.data);
				}
				stack.push(node);
				node = node.left;
			} else {
				if (stack.isEmpty()) {
					if (list.isEmpty()) {
						err.println("平衡");	
					} else {
						err.println("不平衡: " + list);
					}
					break;
				}
				node = stack.peek();
				node = node.right;
				stack.pop();
			}
		}
	}
	
	// 得到平衡因子
	public int getFactor(Test329Node node) {
		if (node == null) {
			return 0;
		}
		int factor = getHeight(node.left) - getHeight(node.right); 
		return factor;
	}
	
	// 得到高度,包括node
	public int getHeight(Test329Node node) {
		Queue<Test329Node> queue = new ArrayDeque<Test329Node>();
		if (node == null) {
			return 0;
		}
		queue.add(node);
		int num = 1;
		int num2 = 0;
		int height = 1;
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
			if (num == 0) {
				num = num2;
				num2 = 0;
				if (queue.isEmpty()) {
					return height;
				}
				height++;
			}
		}
	}
	
	
	public void levelTraversal() {
		String result = "层序遍历: ";
		if (this.boot == null) {
			err.println(result);
			return;
		}
		Queue<Test329Node> queue = new ArrayDeque<Test329Node>();
		queue.add(this.boot);
		for (Test329Node node = this.boot;;) {
			node = queue.poll();
			result = result + node.data + ", "; 
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
			if (queue.isEmpty()) {
				err.println(result);
				break;
			}
		}
	}
	
	
}
