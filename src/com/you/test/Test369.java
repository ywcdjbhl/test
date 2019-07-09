package com.you.test;

import java.util.NoSuchElementException;

// 红黑树 不一定是满的
public class Test369 {

}

class Test369Tree {
    Test369Node boot;// 根节点为黑色
    // 新增结点,新增的结点是红色的,然后在调整
    public void add(int i) {
        if (this.boot == null) {
            this.boot = new Test369Node(i);
            this.boot.red = false;
            return;
        }
        Test369Node father;
        Test369Node newnode;
        for (Test369Node node = this.boot; ; ) {
            if (node.data > i) {
                if (node.left == null) {
                    node.left = new Test369Node(i);
                    father = getFather(node.left);
                    newnode = node.left;
                    break;
                }
                node = node.left;

            } else if (node.data < i) {
                if (node.right == null) {
                    node.right = new Test369Node(i);
                    father = getFather(node.right);
                    newnode = node.right;
                    break;
                }
                node = node.right;
            } else {
                return;
            }
        }

        if (father.red) {
            // 父结点是红色,调整
            adjust(newnode);
        }
    }

    // 调整
    public void adjust(Test369Node node) {
        // 新增结点的父结点的父结点是黑色的
        
    }

    public Test369Node getFather(Test369Node node) {
        Test369Node father = null;
        for (Test369Node node2 = this.boot; ; ) {
            if (node2.data == node.data) {
                return father;
            } else {
                if (node2.data > node.data) {
                    if (node2.left == null) {
                        throw new Test369NoFatherException();
                    }
                    node2 = node2.left;
                } else if (node2.data < node.data) {
                    if (node2.right == null) {
                        throw new Test369NoFatherException();
                    }
                    node2 = node2.right;
                }
            }
        }
    }

}

class Test369Node {
    boolean red = true;// 是否是红结点,默认是红色
    int data;
    Test369Node left;
    Test369Node right;
    public Test369Node(int i) {
        data = i;
    }
}

class Test369NoFatherException extends NoSuchElementException {
    public Test369NoFatherException() {
    }

    public Test369NoFatherException(String s) {
        super(s);
    }
}
