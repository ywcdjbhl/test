package com.you.test;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Test34 {
	public static void main(String[] args) throws IOException{
		Logger log=Logger.getLogger("d://log.txt");
		ConsoleHandler ch=new ConsoleHandler();
		ch.setLevel(Level.INFO);
		log.addHandler(ch);
		FileHandler fh=new FileHandler("d://log.txt");
		fh.setFormatter(new MyLogHandler());
		fh.setLevel(Level.INFO);
		log.addHandler(fh);
		log.info("ssssssssss");
	}
}
class MyLogHandler extends Formatter{
	public String format(LogRecord record){
		return "级别:"+record.getLevel()+"-日志信息:"+record.getMessage()+"\n";
	}
}
