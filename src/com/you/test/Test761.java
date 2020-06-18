package com.you.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
// ClassPathXmlApplicationContext.getBeanFactory
public class Test761 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.getBeanFactory();
    }
}
