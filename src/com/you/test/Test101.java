package com.you.test;

import com.alibaba.fastjson.JSONObject;

public class Test101 {
	public static void main(String[] args) {
		String json = "{'addReSs':'北京'}";
		Test102 test = JSONObject.parseObject(json, Test102.class);
		System.out.println(test);
	}
}
