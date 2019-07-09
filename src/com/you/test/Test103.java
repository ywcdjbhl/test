package com.you.test;

import com.alibaba.fastjson.JSONObject;

public class Test103 {
	public static void main(String[] args) {
		String json = "{'adress':'nanjing','sex':true,}";
		JSONObject jsonObject = JSONObject.parseObject(json);
		System.out.println(jsonObject);
		System.out.println(jsonObject.getBoolean("sex"));
		JSONObject jsonObject2 = jsonObject.getJSONObject("hine");
		System.out.println(jsonObject2);
	}
}
