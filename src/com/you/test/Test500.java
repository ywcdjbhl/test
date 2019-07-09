package com.you.test;
import java.io.PrintStream;
public class Test500 {
    public static int count;
    public static PrintStream err = System.err;
    public static void main(String[] args) {
        while (true) {
            err.println(count);
            count = count + 1;
            new Test500Thread().start();
        }
    }
}

class Test500Thread extends Thread {
    @Override
    public void run() {
        while (true);
    }
}
