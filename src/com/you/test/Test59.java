package com.you.test;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class Test59 {
	public static void main(String[] args) {
		String json = "[null,{'address':null},{}]";
		List<Test42> test = JSONObject.parseArray(json, Test42.class);
		System.out.println(test.get(0) == null);
	}
}
