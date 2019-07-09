package com.you.test;

import com.alibaba.fastjson.JSONObject;

public class Test133 {
	private Integer age;
	public void setAge(Integer age) {
		this.age = 33;
	}
	
	public static void main(String[] args) {
		String json = "{'age':'seven'}";
		Test133 test = JSONObject.parseObject(json, Test133.class);
		System.out.println(test.age);
	}
	
}
