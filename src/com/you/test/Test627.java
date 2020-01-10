package com.you.test;

import org.springframework.util.PropertyPlaceholderHelper;

public class Test627 {
    public static void main(String[] args) {
        PropertyPlaceholderHelper.PlaceholderResolver er = null;
        String text = null;
        new PropertyPlaceholderHelper("a", "b").replacePlaceholders(text, er);
    }
}
