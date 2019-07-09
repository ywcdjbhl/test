package com.you.test;
import java.io.PrintStream;
public class Test391 {
    public int hashCode() {
        return 17;
    }
    public static void main(String[] args) {
        Test391 test = new Test391();
        Test391 test2 = new Test391();
        PrintStream err = System.err;
        err.println(test.hashCode() == test2.hashCode());
        err.println(test == test2);
    }
}
