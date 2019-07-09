package com.you.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Test188_2
public class Test188 {
	@Test188_3
	private String name;
	@Test188_4
	private void run() {}
	
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Test188_2 {
	
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Test188_3 {
	
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test188_4 {
	
}