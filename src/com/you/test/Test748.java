package com.you.test;

import java.util.Locale;

public class Test748 {
    public static void main(String[] args) {
        StringBuilder jsonBuilder = new StringBuilder();
        Integer version = 224;
        Locale locale = Locale.SIMPLIFIED_CHINESE;
        jsonBuilder.append("{\"status\":{\"statuscode\":\"0\",\"message\":\"success\"},\"data\":{")
                .append("\"locale\":\"").append(locale.toLanguageTag()).append("\",\"dataLists\":{},\"version\":")
                .append(version);
        jsonBuilder.append("}}");
        System.err.println(jsonBuilder);
    }
}
