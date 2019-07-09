package com.you.test;

public class Test492 {
    public static void main(String[] args) {
        for (int i = 0;i < 100000000; i++) {
            Test492_2 t = new Test492_2();
            t.age = 87;
            t.name = "curry";
        }
    }
}

class Test492_2 {
    public int age;
    public String name;
}
