package com.you.test;

import java.io.PrintStream;
import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.you.bean.Key;
import com.you.bean.Lock;

public class Test5 {
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
			List<Lock> list=sqlMapClient.queryForList("getAllLock");
			for(Lock lock:list){
				List<Key> keys=lock.getKeys();
				String s="";
				for(Key key:keys){
					s=s+key.getId()+",";
				}
				err.println(lock.getId()+"----"+s);
			}
			err.println("-------------------------");
			List<Key> list2=sqlMapClient.queryForList("getAllKey");
			for(Key key:list2){
				Lock lock=key.getOther();
				List<Key> keys=lock.getKeys();
				String s="";
				for(Key key2:keys){
					s=s+key2.getId()+",";
				}
				err.println(key.getId()+"---"+lock.getId()+"---"+s);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
