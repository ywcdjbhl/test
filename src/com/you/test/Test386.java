package com.you.test;

import java.util.LinkedList;
import java.util.List;

public class Test386 {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for (String s : list) {
            if ("1".equals(s)) {
                list.remove("1");
            }
        }
    }
}

class Test386_2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add("1");
        list.add("2");
        for (String s : list) {
            if ("1".equals(s)) {
                list.remove("1");
            }
            if ("2".equals(s)) {
                System.err.println("222222");
            }
        }
    }
    // 删除"1"后，list的size从2变成1，hasNext()判断时，cursor=1
    // cursor=size,hasNext()==false,循环结束，不遍历"2"
}

