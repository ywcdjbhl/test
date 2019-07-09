package com.you.test;

import com.alibaba.fastjson.JSONObject;

public class Test248 {
	public static void main(String[] args) {
		String json = "{'house':'bieshu','square':'100','num':3,'street':'wudaokou'}";
		Test248_2 test = JSONObject.parseObject(json, Test248_2.class);
		System.out.println(test);
	}
}

class Test248_2 {
	public String house;
	public double square;
	private float num;
	private String street;
	public String toString() {
		String s = "house:" + house + ", square:" + square + ", num:" + num + ", street:" + street;
		return s;
	}
}