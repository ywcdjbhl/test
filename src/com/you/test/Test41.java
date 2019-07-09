package com.you.test;

import java.util.Arrays;

public class Test41 {
	private Integer age;
	private String name;
	private Test42[] test42;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Test42[] getTest42() {
		return test42;
	}
	public void setTest42(Test42[] test42) {
		this.test42 = test42;
	}
	@Override
	public String toString() {
		return "Test41 [age=" + age + ", name=" + name + ", test42="
				+ Arrays.toString(test42) + "]";
	}
}
