package com.you.test;
import java.io.PrintStream;

import com.google.gson.Gson;

public class Test39 {
	public static void main(String[] args){
		PrintStream err = System.err;
		Gson gson = new Gson();
		String s = gson.toJson(null);
		err.println(s == null);
		err.println("null".equals(s));
		Test39[] ts = new Test39[2];
		ts[1] = null;
		s = gson.toJson(ts);
		err.println(s);
	}
}
