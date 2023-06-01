package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5432/softdb";
		String username="soft";
		String password="soft123";
		
		Connection con=null;
		try {
		con=DriverManager.getConnection(url, username, password);
		System.out.println("Connected");
		
		String sql = "select * from product";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			int pId=rs.getInt(1);
			String pName=rs.getString(2);
			float pPrice=rs.getFloat(3);
			System.out.println(pId+" "+pName+" "+pPrice);
		}
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
