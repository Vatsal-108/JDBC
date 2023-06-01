package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static final String url = "jdbc:postgresql://localhost:5432/softdb";
	static final String username="soft";
	static final String password="soft123";
	
	public static Connection getconnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(url, username, password);
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
		
	}
}
