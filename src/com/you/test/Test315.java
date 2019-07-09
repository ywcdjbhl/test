package com.you.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// 万东
public class Test315 {
	public  String get(int a, int b, int c, int d, int e, int f){
		String str = "" ;
		List<Integer> list = new ArrayList<Integer>();
		   list.add(a);
		   list.add(b);
		   list.add(c);
		   list.add(d);
		   list.add(e);
		   list.add(f);
		   Collections.sort(list);
		   for(int i=0;i<list.size();i++) {
			  switch (i) {
				case 0:
					if(list.get(i)<=2) {
						str+= list.get(i);
					}
					break;
                case 1:
                	if(list.get(i)<=4) {
						str+= list.get(i);
						str+=":";
					}
					break;
                case 2:
                	if(list.get(i)<=5) {
						str+= list.get(i);
					}
	                break;
                 case 3:
                	 if(!"".equals(str)) {
                		 str+= list.get(i)+":";
                	 }
	                break;
                 case 4:
                	 if(list.get(i)<=5) {
 						str+= list.get(i);
 					}
	                break;
                 case 5:
                	 if(!"".equals(str)) {
                	   str+= list.get(i);
                	 }
	                break;
				default:
					break;
			}
			  
		   }
		   if("".equals(str)||"24:59:59".equals(str)||str.length()<8){
			   str = "NOT";
			   System.out.println(str);
		   }
		   return str;
	}
	
	public static void main(String[] args) {
		Test315 test = new Test315();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 1;
		test.get(a, b, c, d, e, f);
	}
}
