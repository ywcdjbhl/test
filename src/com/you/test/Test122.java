package com.you.test;

public class Test122 {
	public static void main(String[] args) {
		Test121_2 test = new Test121_2();
		Test121AnnotationProcessor.init(test);
		System.out.println(test);
		Object object = new Object();
		Test121AnnotationProcessor.init(object);
	}
}
