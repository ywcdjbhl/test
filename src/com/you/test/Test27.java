package com.you.test;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Test27 {
	public static void main(String[] args){
		Map map=new HashMap();
		String s=(String)map.get("");
		PrintStream err=System.err;
		err.println(s==null);
		BigDecimal bd=(BigDecimal)map.get("");
		err.println(bd==null);
	}
}
