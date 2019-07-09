package com.you.test;
import java.io.PrintStream;
public class Test482 {
    public int age;
    public static void main(String[] args) {
        Test482 test = new Test482();
        Test482[] tests = new Test482[3];
        tests[0] = test;
        Test482[] tests2 = new Test482[5];
        System.arraycopy(tests,0, tests2, 0, 1);
        PrintStream err = System.err;
        err.println(tests2[0]);
        err.println(tests2[0].age);
        tests[0].age = 7;
        err.println(tests2[0].age);

    }
}
