package com.you.test;

public class Test13 {
	public static void main(String[] args){
		try{
			String command = "taskkill /f /im eclipse.exe";  
			Runtime.getRuntime().exec(command);			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
