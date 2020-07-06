package com.you.test;

import org.springframework.util.PropertyPlaceholderHelper;
// PropertyPlaceholderHelper
public class Test768 {
    public static void main(String[] args) {
        PropertyPlaceholderHelper helper = new PropertyPlaceholderHelper("${", "}");
        helper.replacePlaceholders(null, (PropertyPlaceholderHelper.PlaceholderResolver)null);

    }
}
