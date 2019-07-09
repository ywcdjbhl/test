package com.you.test;
import java.io.PrintStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
public class Test190 {
	public static void main(String[] args) {
		Class<?> clazz = Test190_2.class;
		boolean flag = clazz.isAnnotationPresent(Test190_3.class);
		PrintStream err = System.err;
		err.println(flag);
	}
}
@Test190_3
class Test190_2 {
	
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Test190_3 {
	
}
