package com.you.test;
import java.io.PrintStream;

import com.alibaba.fastjson.JSONObject;

public class Test40 {
	public static void main(String[] args){
		PrintStream err = System.err;
		String json = "{\"data\":{\"name\":\"lisi\",\"age\":11,\"test42\":[{\"address\":\"beijing\"},{},{}]}}";
		JSONObject jsonObject = JSONObject.parseObject(json);
		err.println(jsonObject);
		Test41 test41 = jsonObject.getObject("data",new Test41().getClass());
		err.println(test41);
		Test42[] test42 = test41.getTest42();
		for (Test42 test:test42) {
			err.println(test);
		}
		
	}
}
