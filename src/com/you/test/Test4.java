package com.you.test;

import java.io.PrintStream;
import java.io.Reader;
import java.util.List;
import java.util.UUID;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.you.bean.Cup;

public class Test4 {
	private static SqlMapClient sqlMapClient=null;
	private static PrintStream err=System.err;
	public static void main(String []args){
		init();
		insert();
	}
	public static void init(){
		try{
			Reader reader=Resources.getResourceAsReader("sqlMapConfig.xml");
			sqlMapClient=SqlMapClientBuilder.buildSqlMapClient(reader);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void select(){
		try{
			List list=sqlMapClient.queryForList("select");
			err.println(list);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void insert(){
		try{
			Cup cup=new Cup();
			UUID uuid=UUID.randomUUID();
			cup.setCupId(uuid.toString());
			cup.setCupPrice("3");
			sqlMapClient.insert("insert",cup);
			select();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
