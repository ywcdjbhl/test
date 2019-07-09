package com.you.test;
import java.io.PrintStream;
public class Test381 {
    public int eat() {
        int i = 16;
        return i++;
    }

    public int eat2() {
        int i = 16;
        return ++i;
    }

    public int eat3() {
        int i = 16;
        return i--;
    }

    public int eat4() {
        int i = 16;
        return --i;
    }

    public int drink(int i) {
        return i++;
    }

    public int drink2(int i) {
        return ++i;
    }

    public int drink3(int i) {
        return i--;
    }

    public int drink4(int i) {
        return --i;
    }
    public static void main(String[] args) {
        Test381 test = new Test381();
        PrintStream err = System.err;
        err.println(test.eat());
        err.println(test.eat2());
        err.println(test.eat3());
        err.println(test.eat4());
        err.println(test.drink(19));
        err.println(test.drink2(19));
        err.println(test.drink3(19));
        err.println(test.drink4(19));
    }
}
