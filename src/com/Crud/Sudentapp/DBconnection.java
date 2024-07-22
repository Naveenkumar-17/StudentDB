package com.Crud.Sudentapp;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Statement;

public class DBconnection {

	static Connection con;
	static String url="jdbc:mysql://localhost:3308/naveen";
	static String user="root";
	static String psw="";
	public static Connection createDBconnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,psw);
//		    Statement;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
