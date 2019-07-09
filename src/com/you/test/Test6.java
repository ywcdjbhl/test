package com.you.test;

import java.io.PrintStream;
import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.you.bean.Girl;
import com.you.bean.Boy;

public class Test6 {
	private static SqlMapClient sqlMapClient=null;
	private static PrintStream err=System.err;
	public static void main(String []args){
		init();
		select();
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
			List<Boy> list=sqlMapClient.queryForList("getAllBoy");
			for(Boy boy:list){
				List<Girl> girls=boy.getGirls();
				String s="";
				for(Girl girl:girls){
					s=s+girl.getName()+",";
				}
				err.println(boy.getName()+"----"+s);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
