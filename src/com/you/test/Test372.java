

package com.you.test;

import java.io.PrintStream;

/**
 * getLowerData
 * getHigherData
 */
public class Test372 {
    public static void main(String[] args) {
        PrintStream err = System.err;
        Test372Tree tree = new Test372Tree();
        tree.getLowerData(3);
        err.println("-----------------------");
        tree = new Test372Tree();
        int[] is = new int[] {4};
        tree.add(is);
        tree.getLowerData(3);
        err.println("-----------------------");
        tree = new Test372Tree();
        is = new int[] {1, 3, 5, 7, 9, 2 ,4 ,6, 8};
        tree.add(is);
        tree.getLowerData(0);
        tree.getLowerData(1);
        tree.getLowerData(2);
        tree.getLowerData(3);
        tree.getLowerData(4);
        tree.getLowerData(5);
        tree.getLowerData(6);
        tree.getLowerData(7);
        tree.getLowerData(8);
        tree.getLowerData(9);
        err.println("-----------------------");
        tree = new Test372Tree();
        is = new int[] {4, 9, 5, 98, 13};
        tree.add(is);
        tree.getLowerData(3);
        tree.getLowerData(6);
        tree.getLowerData(10);
        tree.getLowerData(100);
        err.println("-----------------------");
        err.println("-----------------------");
        tree = new Test372Tree();
        is = new int[] {};
        tree.add(is);
        tree.getHigherData(3);
        tree.getHigherData(6);
        tree.getHigherData(10);
        tree.getHigherData(100);
        err.println("-----------------------");
        tree = new Test372Tree();
        is = new int[] {1};
        tree.add(is);
        tree.getHigherData(3);
        tree.getHigherData(6);
        tree.getHigherData(10);
        tree.getHigherData(100);
        err.println("-----------------------");
        tree = new Test372Tree();
        is = new int[] {1, 3};
        tree.add(is);
        tree.getHigherData(3);
        tree.getHigherData(6);
        tree.getHigherData(10);
        tree.getHigherData(100);
        err.println("-----------------------");
        tree = new Test372Tree();
        is = new int[] {1, 3, 5, 7, 9, 2 ,4 ,6, 8};
        tree.add(is);
        tree.getHigherData(3);
        tree.getHigherData(6);
        tree.getHigherData(10);
        tree.getHigherData(100);

    }
}

class Test372Tree {
    Test372Node boot;
    PrintStream err = System.err;
    public void add(int i) {
        if (this.boot == null) {
            this.boot = new Test372Node(i);
            return;
        }
        for (Test372Node node = this.boot; ; ) {
            if (i > node.data) {
                if (node.right == null) {
                    node.right = new Test372Node(i);
                    break;
                } else {
                    node = node.right;
                }
            } else if (i < node.data) {
                if (node.left == null) {
                    node.left = new Test372Node(i);
                    break;
                } else {
                    node = node.left;
                }
            } else {
                break;
            }
        }
    }

    public void add(int[] is) {
        for (int i : is) {
            add(i);
        }
    }

    // 打印比i小的最大值, 没有打印null
    public void getLowerData(int i) {
        if (this.boot == null) {
            err.println(i + " getLowerData : null");
            return;
        }
        for (Test372Node node = this.boot; ; ) {
            if (node.data < i) {
                // 往node的右子结点找
                if (node.right == null) {
                    err.println(i + " getLowerData : " + node.data);
                    break;
                } else {
                    node = node.right;
                }
            } else {
                // 往node的右子结点找
                if (node.left != null) {
                    node = node.left;
                } else {
                    for (; ; ) {
                        Test372Node father = getFather(node);
                        if (father == null) {
                            err.println(i + " getLowerData : null");
                            return;
                        }
                        if (father.data < i) {
                            err.println(i + " getLowerData : " + father.data);
                            return;
                        }
                        node = father;
                    }
                }
            }
        }
    }

    // 打印比i大的最小值,没有打印null
    public void getHigherData(int i) {
        if (this.boot == null) {
            err.println(i + " getHigherData : null");
            return;
        }
        for (Test372Node node = this.boot; ; ) {
            if (i >= node.data) {
                if (node.right == null) {
                    for (; ; ) {
                        Test372Node father = getFather(node);
                        if (father == null) {
                            err.println(i + " getHigherData : null");
                            return;
                        }
                        if (father.data > i) {
                            err.println(i + " getHigherData : " + father.data);
                            return;
                        } else {
                            node = father;
                        }
                    }
                } else {
                    node = node.right;
                }
            } else {
                if (node.left != null) {
                    node = node.left;
                } else {
                    err.println(i + " getHigherData : " + node.data);
                    return;
                }
            }
        }
    }


    public Test372Node getFather(Test372Node node) {
        if (node == this.boot) {
            return null;
        }
        for (Test372Node node2 = this.boot; ; ) {
            if (node2.data > node.data) {
                if (node2.left == node) {
                    return node2;
                } else {
                    node2 = node2.left;
                }
            } else if (node2.data < node.data) {
                if (node2.right == node) {
                    return node2;
                } else {
                    node2 = node2.right;
                }
            }
        }
    }

}

class Test372Node {
    int data;
    Test372Node left;
    Test372Node right;
    public Test372Node(int i) {
        this.data = i;
    }

    @Override
    public String toString() {
        return this.data + "";
    }
}

