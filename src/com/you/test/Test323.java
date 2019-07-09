package com.you.test;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

// 平衡二叉树,不线索,作废
public class Test323 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		int[] is = new int[] {};
		Test323Tree tree = new Test323Tree();
		tree.add(is);
		boolean flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {81};
		tree = new Test323Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {1,2};
		tree = new Test323Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {1,2,0};
		tree = new Test323Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {3, 2, 1};
		tree = new Test323Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {5, 4, 3, 2, 1};
		tree = new Test323Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {9, 10, 7, 11, 8, 5, 6, 4, 3};
		tree = new Test323Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {1, 2, 3};
		tree = new Test323Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {3, 2, 5, 1, 4, 7, 8, 6, 9};
		tree = new Test323Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
		is = new int[] {9, 7, 8};
		tree = new Test323Tree();
		tree.add(is);
		flag = tree.isBalance();
		err.println("是否平衡: " + flag);
		tree.levelTraversal();
		err.println("-------------------");
	}
}

class Test323Node {
	Test323Node left;
	Test323Node right;
	int data;
	public Test323Node(int i) {
		data = i;
	}
}

class Test323Tree {
	Test323Node boot;
	PrintStream err = System.err;
	boolean isBalance() {
		if (this.boot == null) {
			return true;
		}
		List<Integer> list = new ArrayList<Integer>();
		Queue<Test323Node> queue = new ArrayDeque<Test323Node>();
		queue.add(this.boot);
		for (Test323Node node;;) {
			node = queue.poll();
			int factor = getFactor(node);
			if (factor > 1 || factor < -1) {
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

	// 以node为根结点的树是否平衡
	boolean isBalance(Test323Node node) {
		if (node == null) {
			return true;
		}
		Queue<Test323Node> queue = new ArrayDeque<Test323Node>();
		queue.add(node);
		for (; !queue.isEmpty();) {
			node = queue.poll();
			if (getFactor(node) > 1 || getFactor(node) < -1) {
				return false;
			}
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		return true;
	}

	// 根据最新插入结点的值得到最低不平衡结点
	public Test323Node getLowestNotBalance(int data) {
		Stack<Test323Node> stack = new Stack<Test323Node>();
		for (Test323Node node = this.boot; node.data != data;) {
			stack.push(node);
			if (data > node.data) {
				node = node.right;
			} else if (data < node.data) {
				node = node.left;
			}
		}
		for (Test323Node node; !stack.isEmpty();) {
			node = stack.pop();
			if (!isBalance(node)) {
				return node;
			}
		}
		return null;
	}
	
	// 根据最新插入结点的值得到最低不平衡结点的父结点
	public Test323Node getLowestNotBalancesfather(int data) {
		Stack<Test323Node> stack = new Stack<Test323Node>();
		for (Test323Node node = this.boot; node.data != data;) {
			stack.push(node);
			if (data > node.data) {
				node = node.right;
			} else if (data < node.data) {
				node = node.left;
			}
		}
		for (Test323Node node; !stack.isEmpty();) {
			node = stack.pop();
			if (!isBalance(node)) {
				if (!stack.isEmpty()) {
					return stack.peek();
				}
			}
		}
		return null;
	}
	

	int getHeight(Test323Node node) {
		if (node == null) {
			return 0;
		}
		Queue<Test323Node> queue = new ArrayDeque<Test323Node>();
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

	// 平衡因子
	int getFactor(Test323Node node) {
		if (node == null) {
			return 0;
		}
		int factor = getHeight(node.left) - getHeight(node.right);
		return factor;
	}
	
	public void add(int[] is) {
		for (int i : is) {
			add(new Test323Node(i));
		}
	}
	
	// 加之前是平衡的
	public void add(Test323Node node) {
		if (this.boot == null) {
			this.boot = node;
			return;
		}
		for (Test323Node prenode = this.boot;;) {
			if (node.data > prenode.data) {
				if (prenode.right == null) {
					prenode.right = node;
					boolean flag = isBalance();
					if (flag) {
						// 平衡
						break;	
					} else {
						// 不平衡
						// 最低不平衡结点
						Test323Node lownode = getLowestNotBalance(node.data);
						// 最低不平衡结点的父结点
						Test323Node lownodefather = getLowestNotBalancesfather(node.data);
						if (lownodefather == null) {
							// 最低不平衡结点是根节点
							Test323Node temp = this.boot;
							this.boot = this.boot.right;
							temp.right = this.boot.left;
							this.boot.left = temp;
							levelTraversal();
							break;
						} else {
							// 最低不平衡结点不是根结点
							if (lownodefather.data < lownode.data) {
								// 最低不平衡结点是其父结点的右子结点
								lownodefather.right = lownode.right;
								lownode.right = lownodefather.right.left;
								lownodefather.right.left = lownode;
								levelTraversal();
								break;
							} else if (lownodefather.data > lownode.data) {
								// 最低不平衡结点是其父结点的左子结点
								
							}
						}
					}
				} else {
					prenode = prenode.right;
				}
			} else if (node.data < prenode.data) {
				if (prenode.left == null) {
					prenode.left = node;
					boolean flag = isBalance();
					if (flag) {
						// 平衡
						break;
					} else {
						// 不平衡
						// 最低不平衡结点
						Test323Node lownode = getLowestNotBalance(node.data);
						// 最低不平衡结点的父结点
						Test323Node lownodefather = getLowestNotBalancesfather(node.data);
						if (lownodefather == null) {
							// 最低不平衡结点是根结点
							int factor = getFactor(this.boot);
							if (factor > 1) {
								// 左子树深度大
								Test323Node temp= this.boot;
								this.boot = this.boot.left;
								temp.left = this.boot.right;
								this.boot.right = temp;
								levelTraversal();
								break;
							}
						} else {
							if (lownodefather.data > lownode.data) {
								// 最低不平衡结点是其父结点的左子结点
								if (lownode.data > node.data) {
									// 新增结点位于最低不平衡结点的左子树
									// 向右转
									lownodefather.left = lownode.left;
									Test323Node temp = lownode.left.right; 
									lownode.left.right = lownode;
									lownode.left = temp;
									levelTraversal();
									break;
								} else if (lownode.data < node.data) {
									// 新增结点位于最低结点不平衡结点的右子树
								}
							}	
						}
					}
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
		Queue<Test323Node> queue = new ArrayDeque<Test323Node>();
		queue.add(this.boot);
		for (Test323Node node; !queue.isEmpty();) {
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
