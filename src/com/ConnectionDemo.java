package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driverClassName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/softdb";
		String username="soft";
		String password="soft123";
		
		Class.forName(driverClassName);
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connected");
		
		con.close();
		System.out.println("Connection Closed");
		
		
	}

}
