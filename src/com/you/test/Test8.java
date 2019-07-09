package com.you.test;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.you.bean.Person;
public class Test8 {
	public static void main(String[] args){
		try{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:/person.dat"));
			Object person=ois.readObject();
			Person p=(Person)person;
			System.out.println(p);
			p.print();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
