package com.you.test;

import com.alibaba.fastjson.JSONObject;

public class Test49 {
	public static void main(String[] args) {
		String json = "{\"name\":\"lisi\"}";
		Test41 test = JSONObject.parseObject(json, Test41.class);
		System.out.println(test.getTest42() == null);
	}
}
