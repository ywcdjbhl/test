package com.you.test;
import java.io.PrintStream;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class Test45 {
	public static void main(String[] args) {
		//String json = "[{},{},{}]";
		//String json = null;
		String json = "  [  {},{   }  ,{   } ]   ";
		List<Test42> testList = JSONObject.parseArray(json, Test42.class);
		PrintStream err = System.err;
		err.println(testList);
	}
}
