package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:postgresql://localhost:5432/softdb";
		String username="soft";
		String password="soft123";
		
		Connection con=null;
		try {
		con=DriverManager.getConnection(url, username, password);
		System.out.println("Connected");
		
		String sql = "insert into product values(1004,'SamsungF',42000)";
		Statement st=con.createStatement();
		st.executeUpdate(sql);
		System.out.println("product saved");
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Connection Closed");
		}
		

	}

}
