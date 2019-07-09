package com.you.test;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class Test131 {
	public static void main(String[] args) {
		String json = "[null,null,null]"; 
		List<Test131> list = JSONObject.parseArray(json, Test131.class);
		list.add(null);
		list.add(null);
		list.add(null);
		for (Test131 test : list) {
			System.out.println(test == null);
		}
	}
}
