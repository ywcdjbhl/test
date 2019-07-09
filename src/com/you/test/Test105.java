package com.you.test;

import com.alibaba.fastjson.JSONObject;

public class Test105 {
	public static void main(String[] args) {
		String json = "{'adress':'nanjing','sex':true,}";
		JSONObject jsonObject = JSONObject.parseObject(json);
		JSONObject test42 = jsonObject.getJSONObject("adress");
		System.out.println(test42 == null);
	}
}
