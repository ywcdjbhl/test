package com.you.test;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test127 {
	private static PrintStream err = System.err;
	public static void insert(String sql){
		try{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tete");
			err.println(conn);
			Statement st=conn.createStatement();
			err.println(st);
			st.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		insert("delete from boy");
	}
}
