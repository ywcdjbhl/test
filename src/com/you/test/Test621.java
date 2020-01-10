package com.you.test;

import org.springframework.util.PropertyPlaceholderHelper;

public class Test621 {
    public static void main(String[] args) {
        new PropertyPlaceholderHelper("{", "}", ":", true);
    }
}
