package com.you.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test545 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("folder/roomOptContext.xml");
        System.err.println(cc);
    }
}
