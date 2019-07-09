package com.you.test;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

// 2-3树
public class Test331 {
	public static void main(String[] args) {
		Test331Tree tree = new Test331Tree();
		int[] is = new int[] {};
		tree.add(is);
		String result = tree.levelTraversal();
		PrintStream err = System.err;
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'E'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'E', 'S'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'S', 'E'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'A', 'E', 'S'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'A', 'S', 'E'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'E', 'A', 'S'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'E', 'S', 'A'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'S', 'A', 'E'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'S', 'E', 'A'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'S', 'E', 'A', 'R'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'S', 'E', 'A', 'R', 'C'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'S', 'E', 'A', 'R', 'C', 'H'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'S', 'E', 'A', 'R', 'C', 'H', 'X'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'S', 'E', 'A', 'R', 'C', 'H', 'X', 'M'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'S', 'E', 'A', 'R', 'C', 'H', 'X', 'M', 'P'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'S', 'E', 'A', 'R', 'C', 'H', 'X', 'M', 'P', 'L'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'A', 'C'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'A', 'C', 'E'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'A', 'C', 'E', 'H'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'A', 'C', 'E', 'H', 'L'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'A', 'C', 'E', 'H', 'L', 'M'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'A', 'C', 'E', 'H', 'L', 'M', 'P'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'A', 'C', 'E', 'H', 'L', 'M', 'P', 'R'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'A', 'C', 'E', 'H', 'L', 'M', 'P', 'R', 'S'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
		tree = new Test331Tree();
		is = new int[] {'A', 'C', 'E', 'H', 'L', 'M', 'P', 'R', 'S', 'X'};
		tree.add(is);
		result = tree.levelTraversal();
		err.println(result);
		err.println("---------------------------");
	}
}

class Test331Node {
	int data;
	int data2;
	int data3;
	Test331Node left;
	Test331Node mid;
	Test331Node right;
	Test331Node midleft;
	Test331Node midright;
	int num = 2;// 2结点还是3结点还是4结点
	// num = 2 left right     data 
	// num = 3 left mid right     data data2

	@Override
	public String toString() {
		if (this.num == 2) {
            return "(" + (char) this.data + ")";
		} else if (this.num ==3) {
		    return "(" + (char) this.data + ", " + (char) this.data2 + ")";
        } else if (this.num ==4) {
		    return "(" + (char) this.data + ", " + (char) this.data2 + ", " + (char) this.data3 + ")";
		} else {
		    return "";
        }
	}
}

class Test331Tree {
	Test331Node boot;
	char last = ' ';
	// 插入数字
	// 新插入的数字是加在最低一层的,加在某个结点上的,
	// 此时,如果这个结点为3结点,那么不用管,如果为4
	// 结点,向上爆破
	public void add(int i) {
		if (this.boot == null) {
			this.boot = new Test331Node();
			this.boot.data = i;
			return;
		}
		for (Test331Node node = this.boot;;) {
    			if (node.num == 2) {
				if (i < node.data) {
					if (node.left == null) {
						node.data2 = node.data;
						node.data = i;
						node.num = 3;
						return;
					} else {
						node = node.left;
					}
				} else if (i > node.data) {
					if (node.right == null) {
						node.data2 = i;
						node.num = 3;
						return;
					} else {
						node = node.right;
					}
				}
			} else if (node.num == 3) {
				if (i < node.data) {
					if (node.left == null) {
						node.num = 4;
						node.data3 = node.data2;
						node.data2 = node.data;
						node.data = i;
						bomb(node);
						return;
					} else {
						node = node.left;
					}
				} else if (i > node.data && i < node.data2) {
					if (node.mid == null) {
						node.num = 4;
						node.data3 = node.data2;
						node.data2 = i;
						bomb(node);
						return;
					} else {
						node = node.mid;
					}
				} else if (i > node.data2) {
					if (node.right == null) {
						node.num = 4;
						node.data3 = i;
						bomb(node);
						return;
					} else {
						node = node.right;
					}
				}
			}
		}
	}
	
	// 新插入值的结点如果是4结点,分裂
	public void bomb(Test331Node node) {
		if (node.num == 2 || node.num == 3) {
			return;
		}
		// 把中间的值往父结点上送
		for (;;) {
			if (node == this.boot) {
				node.num = 2;
				Test331Node preleft = node.left;
				node.left = new Test331Node();
				node.left.data = node.data;
				Test331Node preright = node.right;
				node.right = new Test331Node();
				node.right.data = node.data3;
				node.data = node.data2;
				node.left.left = preleft;
				node.left.right = node.midleft;
				node.right.left = node.midright;
				node.right.right = preright;

				node.midleft = null;
				node.midright = null;
				break;
			} else {
				Test331Node father = getFather(node);
				if (father.num == 2) {
					if (father.data > node.data) {
						father.num = 3;
						father.data2 = father.data;
						father.data = node.data2;
						father.mid = new Test331Node();
						father.mid.data = node.data3;
						father.left.num = 2;

						Test331Node preright = node.right;
						node.right = node.midleft;
						father.mid.left = node.midright;
						father.mid.right = preright;
						node.midleft = null;
						node.midright = null;
					} else if (father.data < node.data) {
						father.num = 3;
						father.data2 = node.data2;
						father.mid = new Test331Node();
						father.mid.data = node.data;
						node.num = 2;
						node.data = node.data3;

						Test331Node preleft = node.left;
						node.left = node.midright;
						father.mid.left = preleft;
						father.mid.right = node.midleft;
						node.midleft = null;
						node.midright = null;
					}
					break;
				} else if (father.num == 3) {
					if (father.data > node.data) {
						father.num = 4;
						father.midright = father.mid;
						father.midleft = new Test331Node();
						father.midleft.data = node.data3;
						father.left.num = 2;
						father.data3 = father.data2;
						father.data2 = father.data;
						father.data = node.data2;

						father.mid = null;

						Test331Node preright = node.right;
						node.right = node.midleft;
						father.midleft.left = node.midright;
						father.midleft.right = preright;

						node.midleft = null;
						node.midright = null;
					} else if (father.data2 < node.data) {
						father.num = 4;
						father.midleft = father.mid;
						father.midright = new Test331Node();
						father.midright.data = node.data;
						father.right.num = 2;
						father.right.data = father.right.data3;
						father.data3 = node.data2;

						father.mid = null;

						Test331Node preleft = node.left;
						node.left = node.midright;
						father.midright.left = preleft;
						father.midright.right = node.midleft;

						node.midleft = null;
						node.midright = null;
					} else if (father.data < node.data && father.data2 > node.data) {
						father.num = 4;
						father.midleft = father.mid;
						father.midleft.num = 2;
						father.midleft.data = node.data;
						father.midright = new Test331Node();
						father.midright.data = node.data3;
						father.data3 = father.data2;
						father.data2 = node.data2;

						father.mid = null;

						Test331Node preright = node.right;
						node.right = node.midleft;
						father.midright.left = node.midright;
						father.midright.right = preright;

						node.midleft = null;
						node.midright = null;
					}
					node = father;
				}
			}
		}
	}

	// 找父结点
	public Test331Node getFather(Test331Node node2) {
		if (node2 == this.boot) {
			return null;
		}
		for (Test331Node node = this.boot;;) {
			if (node.num == 2) {
				if (node2.data < node.data) {
					if (node.left == null) {
						noSuchNode(node2);
					}
					if (node.left == node2) {
						return node;
					} else {
						node = node.left;
					}
				} else if (node2.data > node.data) {
					if (node.right == null) {
						noSuchNode(node2);
					}
					if (node.right == node2) {
						return node;
					} else {
						node = node.right;
					}
				}
			} else if (node.num == 3) {
				if (node2.data < node.data) {
					if (node.left == null) {
						noSuchNode(node2);
					}
					if (node.left == node2) {
						return node;
					} else {
						node = node.left;
					}
				} else if (node2.data > node.data && node2.data2 < node.data2) {
					if (node.mid == null) {
						noSuchNode(node2);
					}
					if (node.mid == node2) {
						return node;
					} else {
						node = node.mid;
					}
				} else if (node2.data > node.data2) {
					if (node.right == null) {
						noSuchNode(node2);
					} 
					if (node.right == node2) {
						return node;
					} else {
						node = node.right;
					}
				}
			}
		}
	}
	
	// 无此结点异常
	public void noSuchNode(Test331Node node) {
		throw new NoSuchElementException("查无此节点");
	}

	// 层级遍历
	public String levelTraversal() {
		String result = "层级遍历 最后插入 " + last +" :";
		if (this.boot == null) {
			return result;
		}
		Queue<Test331Node> queue = new ArrayDeque<>();
		queue.add(this.boot);
		Test331Node node;
		for (;;) {
			node = queue.poll();
			if (node.num == 2) {
				result = result + " (" + (char) node.data + "),";
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}

			} else if (node.num == 3) {
				result = result + " (" + (char) node.data + ", " + (char) node.data2 + "),";
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.mid != null) {
					queue.add(node.mid);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			if (queue.isEmpty()) {
				return result;
			}
		}
	}

	public void add(int[] is) {
		for (int i : is) {
			add(i);
			last = (char) i;
		}
	}

	@Override
	public String toString() {
		return null;

	}
}
