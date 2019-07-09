package com.you.test;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
// 平衡二叉树,删除
public class Test330 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		int[] is = new int[] {1, 2, 3, 4};
		Test330Tree tree = new Test330Tree();
		tree.add(is);
		tree.delete(5);
		err.println("--------------------");
		err.println("LEAF----------------");
		err.println("RR------------------");
		is = new int[] {3, 4, 2, 5};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(2);
		tree.levelTraversal();
		is = new int[] {2, 1, 4, 3, 5};
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {2, 1, 4, 3, 5};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {3, 2, 5, 1, 4, 6, 7};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(4);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {3, 2, 5, 1, 4, 7, 8, 6};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(4);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {4, 2, 6, 1, 3, 5, 8, 9};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(5);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {4, 2, 6, 1, 3, 5, 8, 7, 9};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(5);
		tree.levelTraversal();
		err.println("--------------------");
		err.println("LL------------------");
		is = new int[] {3, 2, 4, 1};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(4);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {4, 2, 5, 1, 3,};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(5);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {6, 7, 4, 2, 5, 8, 3, 1};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(5);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {3, 2, 7, 1, 5, 8, 6, 4};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(8);
		tree.levelTraversal();
		err.println("--------------------");
		err.println("LR------------------");
		is = new int[] {3, 1, 4, 2};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(4);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {5, 2, 6, 1, 3, 7, 4};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(7);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {5, 2, 6, 1, 3, 7, 4};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {6, 2, 7, 1, 4, 8, 3, 5};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {6, 2, 7, 1, 4, 8, 3, 5};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(8);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {6, 2, 8, 1, 4, 7, 9, 3, 5};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {9, 6, 12, 2, 7, 11, 13, 1, 4, 8, 10, 14, 3, 5};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(8);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {9, 3, 15, 2, 6, 11, 16, 1, 5, 7, 10, 13, 17, 4, 8, 12, 14};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(17);
		tree.levelTraversal();
		err.println("--------------------");
		err.println("RL------------------");
		is = new int[] {2, 1, 4, 3};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {3, 2, 7, 1, 5, 8, 4, 6};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {9, 3, 12, 2 ,7, 11, 13, 1, 5, 8, 10, 14, 4, 6};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {6, 3, 9, 2, 4, 8, 13, 11, 1, 5, 7, 10, 12, 14};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(7);
		tree.levelTraversal();
		err.println("--------------------");
		err.println("DOUBLE--------------");
		is = new int[] {5, 3, 10, 2, 4, 8, 12, 1, 7, 9, 11, 13, 6};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(4);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {5, 2, 10, 1, 3, 8, 12, 4, 7, 9, 11, 13, 6};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		err.println("ONECHILD------------");
		is = new int[] {2, 1};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(2);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {1, 2};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {3, 1, 4, 2};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(2);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {3, 1, 4, 2};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {2, 1, 3, 4};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(3);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {2, 1, 4, 3};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(4);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {6, 3, 7, 2, 4, 8, 1, 5};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(7);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {3, 2, 5, 1, 4, 7, 6};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(2);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {3, 1, 5, 2, 4, 7, 6};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(1);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {6, 3, 8, 2, 4, 7, 1, 5};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(8);
		tree.levelTraversal();
		err.println("--------------------");
		err.println("TWOCHILDREN---------");
		is = new int[] {3, 1, 4, 2};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(3);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {2, 1, 4, 3};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(2);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {5, 2, 7, 1, 4, 6, 8, 3};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(5);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {5, 2, 11, 1, 4, 9, 13, 3, 7, 10, 12, 14, 6, 8};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(2);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {4, 2, 8, 1, 3, 6, 10, 5, 7, 9, 11, 12};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(2);
		tree.levelTraversal();
		err.println("--------------------");
		is = new int[] {4, 2, 9, 1, 3, 6, 11, 5, 7, 10, 12, 8};
		tree = new Test330Tree();
		tree.add(is);
		tree.delete(2);
		tree.levelTraversal();
		err.println("--------------------");
	}
}

class Test330Node {
	int data;
	Test330Node left;
	Test330Node right;
	public Test330Node(int i) {
		data = i;
	}
}
class Test330Tree {
	Test330Node boot;
	PrintStream err = System.err;
	public void add(Test330Node newnode) {
		if (this.boot == null) {
			this.boot = newnode;
			return;
		}
		Test330Node prenode;
		for (Test330Node node = this.boot;;) {
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
			Test330Node node = new Test330Node(i);
			add(node);
			totate(node);
		}
	}
	
	// 根据新增结点旋转
	public void totate(Test330Node newnode) {
		Test330Node lownode = getLownode(newnode);
		if (lownode == null) {
			return;
		}
		if (lownode.data > newnode.data) {
			Test330Node node = lownode.left;
			if (node.data > newnode.data) {
				// 新增结点位于最低不平衡结点的左子结点的左子树
				if (lownode == this.boot) {
					// 最低平衡结点是根结点
					Test330Node temp = this.boot;
					this.boot = this.boot.left;
					temp.left = this.boot.right;
					this.boot.right = temp;
				} else {
					// 最低不平衡结点不是根结点
					Test330Node father = getFather(lownode);
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
					Test330Node temp = lownode.left;
					lownode.left = lownode.left.right;
					temp.right = lownode.left.left;
					lownode.left.left = temp;
					
					temp = this.boot;
					this.boot = lownode.left;
					temp.left = this.boot.right;
					this.boot.right = temp;
				} else {
					Test330Node father = getFather(lownode);
					if (father.data > lownode.data) {
						Test330Node temp = lownode.left;
						lownode.left = lownode.left.right;
						temp.right = lownode.left.left;
						lownode.left.left = temp;
						
						temp = lownode;
						father.left = lownode.left;
						lownode.left = father.left.right;
						father.left.right = temp;
					} else if (father.data < lownode.data) {
						Test330Node temp = lownode.left;
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
					Test330Node temp = this.boot;
					this.boot = this.boot.right;
					temp.right = this.boot.left;
					this.boot.left = temp;
				} else {
					Test330Node father = getFather(lownode);
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
					Test330Node temp = this.boot.right;
					this.boot.right = this.boot.right.left;
					temp.left = this.boot.right.right;
					this.boot.right.right = temp;
					
					temp = this.boot;
					this.boot = this.boot.right;
					temp.right = this.boot.left;
					this.boot.left = temp;
				} else {
					Test330Node father = getFather(lownode);
					if (father.data > lownode.data) {
						Test330Node temp = lownode.right;
						lownode.right = lownode.right.left;
						temp.left = lownode.right.right;
						lownode.right.right = temp;
						
						temp = father.left;
						father.left = father.left.right;
						temp.right = father.left.left;
						father.left.left = temp;
					} else if (father.data < lownode.data) {
						Test330Node temp = lownode.right;
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

	// 根据不平衡结点旋转
	public void totateUnbal(Test330Node node) {
		Test330Node father = getFather(node);
		Test330Node temp;
		int factor = getHeight(node.left) - getHeight(node.right);
		if (factor > 1) {
			// 左边高
			factor = getHeight(node.left.left) - getHeight(node.left.right);
			if (factor >= 0) {
				if (node == this.boot) {
					temp = this.boot;
					this.boot = this.boot.left;
					temp.left = this.boot.right;
					this.boot.right = temp;
				} else {
					if (father.data > node.data) {
						father.left = node.left;
						node.left = father.left.right;
						father.left.right = node;
					} else if (father.data < node.data) {
						father.right = node.left;
						node.left = father.right.right;
						father.right.right = node;
					}
				}
			} else {
				if (node == this.boot) {
					temp = this.boot.left;
					this.boot.left = this.boot.left.right;
					temp.right = this.boot.left.left;
					this.boot.left.left = temp;
					
					temp = this.boot;
					this.boot = this.boot.left;
					temp.left = this.boot.right;
					this.boot.right = temp;
				} else {
					if (father.data > node.data) {
						temp = node.left;
						node.left = node.left.right;
						temp.right = node.left.left;
						node.left.left = temp;
			
						
						father.left = father.left.left;
						node.left = father.left.right;
						father.left.right = node;
					} else if (father.data < node.data) {
						temp = node.left;
						node.left = node.left.right;
						temp.right = node.left.left;
						node.left.left = temp;
						
						father.right = father.right.left;
						node.left = father.right.right;
						father.right.right = node;
						
					}
				}
			}
		} else if (factor < -1) {
			// 右边高
			factor = getHeight(node.right.left) - getHeight(node.right.right);
			if (factor > 0) {
				if (node == this.boot) {
					temp = this.boot.right;
					this.boot.right = this.boot.right.left;
					temp.left = this.boot.right.right;
					this.boot.right.right = temp;
					
					temp = this.boot;
					this.boot = this.boot.right;
					temp.right = this.boot.left;
					this.boot.left = temp;
				} else {
					if (father.data > node.data) {
						temp = node.right;
						node.right = node.right.left;
						temp.left = node.right.right;
						node.right.right = temp;
						
						father.left = father.left.right;
						node.right = father.left.left;
						father.left.left = node;
					} else if (father.data < node.data) {
						temp = node.right;
						node.right = node.right.left;
						temp.left = node.right.right;
						node.right.right = temp;
						
						father.right = father.right.right;
						node.right = father.right.left;
						father.right.left = node;
					}
				}
			} else {
				if (node == this.boot) {
					temp = this.boot;
					this.boot = this.boot.right;
					temp.right = this.boot.left;
					this.boot.left = temp;
				} else {
					if (father.data > node.data) {
						father.left = node.right;
						node.right = father.left.left;
						father.left.left = node;
					} else if (father.data < node.data) {
						father.right = node.right;
						node.right = father.right.left;
						father.right.left = node;
					}
				}
			}
		}
	}
	
	// 由新插入结点得到最低不平衡结点
	public Test330Node getLownode(Test330Node newnode) {
		Stack<Test330Node> stack = new Stack<Test330Node>();
		for (Test330Node node = this.boot;;) {
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
	public Test330Node getFather(Test330Node node2) {
		Test330Node father = null;
		for (Test330Node node = this.boot;;) {
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
	public boolean isBalance(Test330Node node) {
		int factor = getFactor(node);
		if (factor == 0 || factor == -1 || factor == 1) {
			return true;
		} 
		return false;
	}
	
	// 树是否平衡
	public void isBalance() {
		Stack<Test330Node> stack = new Stack<Test330Node>();
		PrintStream err = System.err;
		List<Integer> list = new ArrayList<Integer>();
		for (Test330Node node = this.boot;;) {
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
	public int getFactor(Test330Node node) {
		if (node == null) {
			return 0;
		}
		int factor = getHeight(node.left) - getHeight(node.right); 
		return factor;
	}
	
	// 得到高度,包括node
	public int getHeight(Test330Node node) {
		Queue<Test330Node> queue = new ArrayDeque<Test330Node>();
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
		Queue<Test330Node> queue = new ArrayDeque<Test330Node>();
		queue.add(this.boot);
		for (Test330Node node = this.boot;;) {
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

	public void delete(int i) {
		Test330Node node = get(i);
		if (node == null) {
			return;
		}
		Test330Node father = getFather(node);
		Test330Node temp;
		if (node.left == null && node.right == null) {
			// 叶子结点
			deleteLeaf(node);
		} else if (node.left == null && node.right != null) {
			// 只有右结点
			if (node == this.boot) {
				temp = this.boot;
				this.boot = this.boot.right;
				temp.right = null;
			} else {
				if (father.data > node.data) {
					father.left = node.right;
					node.right = null;
				} else if (father.data < node.data) {
					father.right = node.right;
					node.right = null;
				}
				totatetoBoot(father);
			}
		} else if (node.left != null && node.right == null) {
			// 只有左结点
			if (node == this.boot) {
				temp = this.boot;
				this.boot = this.boot.left;
				temp.left = null;
			} else {
				if (father.data > node.data) {
					father.left = node.left;
					node.left = null;
				} else if (father.data < node.data) {
					father.right = node.left;
					node.left = null;
				}
				totatetoBoot(father);
			}
		} else {
			// 把最低不平衡结点的值变为它的左子树的最右结点的值
			Test330Node rightest = getRightest(node.left);
			Test330Node rightestfather = getFather(rightest);
			node.data = rightest.data;
			// rightest没有右结点,可能有左结点
			if (rightestfather == node) {
				// 最低不平衡结点的左子结点没有右子结点
				temp = node.left;
				node.left = node.left.left;
				temp.left = null;
				totatetoBoot(node);
			} else {
				// 最低不平衡结点的左子结点有右子结点
				rightestfather.right = rightest.left;	
				rightest.left = null;
				totatetoBoot(rightestfather);
			}
			
		}
	}

	// 得到最右结点
	public Test330Node getRightest(Test330Node node) {
		for (;;) {
			if (node.right != null) {
				node = node.right;
			}else {
				return node;
			}
		}
	}
	
	public void totatetoBoot(Test330Node node) {
		for (;;) {
			boolean isbal = isBalance(node);
			if (!isbal) {
				totateUnbal(node);
			}
			if (node == this.boot) {
				break;
			}
			node = getFather(node);
			
		}
	}
	
	// 删除叶子结点
	public void deleteLeaf(Test330Node node) {
		Test330Node father = getFather(node);
		if (node == this.boot) {
			this.boot = null;
		} else {
			if (father.data > node.data) {
				father.left = null;
			} else if (father.data < node.data) {
				father.right = null;
			}
			// 循环找父结点们
			for (;;) {
				boolean isbal = isBalance(father);
				if (!isbal) {
					totateUnbal(father);
				}
				if (father == this.boot) {
					break;
				}
				father = getFather(father);
			}
		}
	}
	
	// 查找
	public Test330Node get(int i) {
		if (this.boot == null) {
			return null;
		}
		for (Test330Node node = this.boot;;) {
			if (node.data > i) {
				node = node.left;
				if (node == null) {
					return null;
				}
			} else if (node.data < i) {
				node = node.right;
				if (node == null) {
					return null;
				}
			} else {
				return node;
			}
		}
	}
	
}
