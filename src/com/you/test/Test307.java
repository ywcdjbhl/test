package com.you.test;

import com.alibaba.fastjson.JSONObject;

public class Test307 {
	public static void main(String[] args) {
		String s = "gangge";
		String s2 = JSONObject.toJSONString(s);
		System.err.println(s2);
	}
}
