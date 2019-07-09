package com.you.test;
import java.io.PrintStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;



public class Test123 {
	@Test123_2 
	public Integer age;
	public static void main(String[] args) {
		Class clazz = Test123.class;
		try {
			Field f = clazz.getField("age");
			PrintStream err = System.err;
			err.println(f.isAnnotationPresent(Test123_2.class));
		} catch (Exception e) {
			
		}
		
	}
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Test123_2 {
	
}
