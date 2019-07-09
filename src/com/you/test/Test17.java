package com.you.test;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Test17 {
	public static void main(String[] args){
		Map<String,Test17> map=new HashMap<String,Test17>();
		PrintStream out=System.err;
		Test17 t=(Test17)map.get("2");
		out.println(t==null);
	}
}
