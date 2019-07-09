package com.you.test;

import java.io.PrintStream;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

public class Test286 {
	public void run() throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read("src/folder/TourPreStoreMapper.xml");
		PrintStream err = System.err;
		err.println(doc);
		
	}
	public static void main(String[] args) throws Exception {
		Test286 test = new Test286();
		test.run();
	}
}
