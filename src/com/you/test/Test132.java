package com.you.test;

import com.alibaba.fastjson.JSONObject;

public class Test132 {
	public static void main(String[] args) {
		String json = "";
		JSONObject jsonObject = JSONObject.parseObject(json);
		System.out.println(jsonObject == null);
	}
}
