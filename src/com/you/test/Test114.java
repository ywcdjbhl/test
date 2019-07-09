package com.you.test;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
public class Test114 {
	public static void main(String[] args) {
		Test113[] tests = new Test113[5];
		Class clazz = tests.getClass();
		PrintStream err = System.err;
		err.println(clazz.isArray());
		err.println(clazz.isEnum());
		err.println(clazz.isInterface());
		err.println("----------------------------");
		Class clazz2 = Test114_2.class;
		err.println(clazz2.isArray());
		err.println(clazz2.isEnum());
		err.println(clazz2.isInterface());
		err.println("----------------------------");
		Class clazz3 = Test114_3.class;
		err.println(clazz3.isArray());
		err.println(clazz3.isEnum());
		err.println(clazz3.isInterface());
		err.println("----------------------------");
		List list = new ArrayList();
		Class clazz4 = list.getClass();
		err.println(clazz4.isArray());
		err.println(clazz4.isEnum());
		err.println(clazz4.isInterface());
		
	}
}
interface Test114_2 {
	void eat();
	void drink();
}
enum Test114_3 {
	
}