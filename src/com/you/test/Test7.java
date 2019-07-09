package com.you.test;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.you.bean.Person;
public class Test7 {
	public static void main(String[] args){
		try{
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d://person.dat"));
			Person p=new Person(11,"jack","beijing");
			System.out.println(p);
			oos.writeObject(p);
			oos.flush();
			oos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
