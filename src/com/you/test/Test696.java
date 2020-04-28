package com.you.test;

import org.springframework.util.Assert;

import java.util.Collection;
import java.util.HashSet;

public class Test696 {
    public static void main(String[] args) {
        Collection coll = new HashSet();
        coll.add(11);
        Assert.notEmpty(coll);
    }
}
