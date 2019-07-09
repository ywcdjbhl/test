package com.you.test;

import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test204 {
	public static void main(String[] args) {
		Test204_5 test = new Test204_5();
		Class<?> clazz = test.getClass();
		boolean isAnnotationPresent = clazz.isAnnotationPresent(TestTypeAnnotation204_2.class);
		PrintStream err = System.err;
		err.println(isAnnotationPresent);
		TestTypeAnnotation204_2 anno = clazz.getAnnotation(TestTypeAnnotation204_2.class);
		err.println(anno);
		isAnnotationPresent = clazz.isAnnotationPresent(TestFieldAnnotation204_3.class);
		err.println(isAnnotationPresent);
		isAnnotationPresent = clazz.isAnnotationPresent(TestMethodAnnotation204_4.class);
		err.println(isAnnotationPresent);
		Annotation[] ans = clazz.getAnnotations();
		for (Annotation an : ans) {
			err.println(an);
			err.println(((TestTypeAnnotation204_2)an).name());
		}
		err.println("----------------------");
		try {
			Method method = clazz.getMethod("run", Object.class);	
			isAnnotationPresent = method.isAnnotationPresent(TestTypeAnnotation204_2.class);
			err.println(isAnnotationPresent);
			isAnnotationPresent = method.isAnnotationPresent(TestFieldAnnotation204_3.class);
			err.println(isAnnotationPresent);
			isAnnotationPresent = method.isAnnotationPresent(TestMethodAnnotation204_4.class);
			err.println(isAnnotationPresent);
			ans = method.getAnnotations();
			for (Annotation an : ans) {
				err.println(an);
				err.println(((TestMethodAnnotation204_4)an).name());
			}
			err.println("----------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Field field = clazz.getField("address");	
			isAnnotationPresent = field.isAnnotationPresent(TestTypeAnnotation204_2.class);
			err.println(isAnnotationPresent);
			isAnnotationPresent = field.isAnnotationPresent(TestFieldAnnotation204_3.class);
			err.println(isAnnotationPresent);
			isAnnotationPresent = field.isAnnotationPresent(TestMethodAnnotation204_4.class);
			err.println(isAnnotationPresent);
			ans = field.getAnnotations();
			for (Annotation an : ans) {
				err.println(an);
				err.println(((TestFieldAnnotation204_3)an).name());
			}
			err.println("----------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface TestTypeAnnotation204_2 {
	String name () default "";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface TestFieldAnnotation204_3 {
	String name() default "";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TestMethodAnnotation204_4 {
	String name() default "";
}
@TestTypeAnnotation204_2(name = "controller")
class Test204_5 {
	@TestFieldAnnotation204_3(name = "beijing")
	public String address;
	
	@TestMethodAnnotation204_4(name = "paobu")
	public void run(Object obj) {
		
	}
}
