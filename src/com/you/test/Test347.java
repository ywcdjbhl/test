package com.you.test;

// 2-3-4树
// 插入采用预分裂插入法
public class Test347 {

}

class Test347Tree {
    Test347Node boot;
    public void add(int i) {
        if (this.boot == null) {
            this.boot = new Test347Node();
            this.boot.data = i;
            return;
        }
        for (Test347Node node = this.boot; ; ) {
            if (node.data == 4) {
                // 预分裂

            }
        }

    }

    public void add(int[] is) {
        for (int i : is) {
            add(i);
        }
    }


    // 查找父结点
    public Test347Node getFather(Test347Node node) {
        if (node == this.boot) {
            return null;
        }
        for (Test347Node node2 = this.boot; ; ) {
            if (node2.num == 2) {
                if (node.data < node2.data) {
                    if (node2.left == node) {
                        return node2;
                    } else {
                        node2 = node2.left;
                    }
                } else if (node.data > node2.data) {
                    if (node2.right == node) {
                        return node2;
                    } else {
                        node2 = node2.right;
                    }
                }
            } else if (node2.num == 3) {
                if (node.data < node2.data) {
                    if (node == node2.left) {
                        return node2;
                    } else {
                        node2 = node2.left;
                    }
                } else if (node.data > node2.data && node.data < node2.data2) {
                    if (node == node2.mid) {
                        return node2;
                    } else {
                        node2 = node2.mid;
                    }
                } else if (node.data > node2.data2) {
                    if (node2.right == node) {
                        return node2;
                    } else {
                        node2 = node2.right;
                    }
                }
            } else if (node2.num == 4) {
                if (node.data < node2.data) {
                    if (node2.left == node) {
                        return node2;
                    } else {
                        node2 = node2.left;
                    }
                } else if (node2.data < node.data && node2.data > node.data) {
                    if (node2.midleft == node) {
                        return node2;
                    } else {
                        node2 = node2.midleft;
                    }
                } else if (node2.data2 < node.data && node2.data3 > node.data) {
                    if (node2.midright == node) {
                        return node2;
                    } else {
                        node2 = node2.midright;
                    }
                } else if (node2.data2 < node.data) {
                    if (node2.right == node) {
                        return node2;
                    } else {
                        node2 = node.right;
                    }
                }
            }
        }
    }
}

class Test347Node {
    int num = 2;
    int data;
    int data2;
    int data3;
    Test347Node left;
    Test347Node right;
    Test347Node mid;
    Test347Node midleft;
    Test347Node midright;
}