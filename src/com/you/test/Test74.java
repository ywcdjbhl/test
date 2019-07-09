package com.you.test;
import java.io.PrintStream;

import com.alibaba.fastjson.JSONObject;

public class Test74 {
	public static void main(String[] args) {
		String json = "{'address':['ss','sss']}";
		Test73 test = JSONObject.parseObject(json, Test73.class);
		PrintStream err = System.err;
		err.println(test);
	}
}
