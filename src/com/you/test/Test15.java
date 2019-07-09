package com.you.test;
import java.io.PrintStream;
import java.util.Map.Entry;
import java.util.Properties;
public class Test15 {
	public static void main(String[] args){
		PrintStream err=System.err;
		Properties pro=System.getProperties();
		for(Entry en:pro.entrySet()){
			err.println(en.getKey()+"--"+en.getValue());
		}
		
	}
}
