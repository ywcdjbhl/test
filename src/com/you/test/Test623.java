package com.you.test;

import org.springframework.util.PropertyPlaceholderHelper;

// PropertyPlaceholderHelper

public class Test623 {
    public static void main(String[] args) {
        String s = null;
        new PropertyPlaceholderHelper("{", s, ":", true);
    }
}
