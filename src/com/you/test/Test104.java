package com.you.test;
import java.io.PrintStream;
public class Test104 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		err.println("free:" + Runtime.getRuntime().freeMemory() / 1024 / 1024);    
        err.println("total:" + Runtime.getRuntime().totalMemory() / 1024 / 1024);    
        err.println("max:" + Runtime.getRuntime().maxMemory() / 1024 / 1024);    
        err.println("=============");    
        try {    
            Thread.sleep(3000);    
        } catch (Exception e) {    
            e.printStackTrace();    
        }    
        String[] aaa = new String[2000000];    
        err.println("free:" + Runtime.getRuntime().freeMemory() / 1024 / 1024);    
        err.println("total:" + Runtime.getRuntime().totalMemory() / 1024 / 1024);    
        err.println("max:" + Runtime.getRuntime().maxMemory() / 1024 / 1024);    
        err.println("=============");    
        try {    
            Thread.sleep(3000);    
        } catch (Exception e) {    
            e.printStackTrace();    
        }    
        for (int i = 0; i < 2000000; i++) {    
            aaa[i] = new String("aaa");    
        }    
        err.println("free:" + Runtime.getRuntime().freeMemory() / 1024 / 1024);    
        err.println("total:" + Runtime.getRuntime().totalMemory() / 1024 / 1024);    
        err.println("max:" + Runtime.getRuntime().maxMemory() / 1024 / 1024);    
        err.println("=============");    
        try {    
            Thread.sleep(3000);    
        } catch (Exception e) {    
            e.printStackTrace();    
        }   
	}
}
