package com.you.test;

import java.util.ArrayList;
import java.util.List;
// String.join
public class Test752 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qi");
        list.add("bin");
        list.add("hui");
        String.join(null, list);
    }
}
