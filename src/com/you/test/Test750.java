package com.you.test;

public class Test750 {
    private String input;

    public Test750(String input) {
        this.input = input;
    }

    public int scan(int start, int end, String err, String stop) {
        int p = start;
        while (p < end) {
            char c = charAt(p);
            if (err.indexOf(c) >= 0)
                return -1;
            if (stop.indexOf(c) >= 0)
                break;
            p++;
        }
        return p;
    }

    private char charAt(int p) {
        return input.charAt(p);
    }

}
