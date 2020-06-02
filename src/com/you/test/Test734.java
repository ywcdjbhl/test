package com.you.test;

import java.io.Serializable;
// transient
public class Test734 implements Serializable {
    public String name;
    public Double height;
    transient public Integer age;
}
