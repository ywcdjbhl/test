package com.you.test;

import org.springframework.util.PropertyPlaceholderHelper;

// PropertyPlaceholderHelper

public class Test625 {
    public static void main(String[] args) {
        new PropertyPlaceholderHelper("$i", "}", ":", true);
    }
}
