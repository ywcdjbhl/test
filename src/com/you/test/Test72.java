package com.you.test;
import java.io.PrintStream;

import com.alibaba.fastjson.JSONObject;

public class Test72 {
	public static void main(String[] args) {
		String json = "{'address':'peking'}";
		Test42 test = JSONObject.parseObject(json, Test42.class);
		PrintStream err = System.err;
		err.println(test);
	}
}
