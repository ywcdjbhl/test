package com.you.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
public @interface Test121 {
	public int id() default 3;
	public String name() default "lisi";
	public String address() default "";
}

class Test121_2 {
	private int id;
	private String name;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Test121
	public Test121_2() {
		
	}
	public String toString() {
		return "id=" + id + " name=" + name + " address=" + address;
	}
	
}

class Test121AnnotationProcessor {
	public static void init(Object object) {
		if (object instanceof Test121_2) {
			Test121_2 test = (Test121_2)object;
			Constructor[] ccs = test.getClass().getDeclaredConstructors();
			for (Constructor cc : ccs) {
				if (cc.isAnnotationPresent(Test121.class)) {
					Test121 testAn = (Test121)cc.getAnnotation(Test121.class);
					int id = testAn.id();
					String address = testAn.address();
					String name = testAn.name();
					System.out.println("注解的id=" + id + " name=" + name + " address=" + address);
					test.setId(id);
					test.setName(name);
					test.setAddress(address);
				}
			}
		} else {
			throw new NullPointerException("不是test121_2类的对象");
		}
	}
}



