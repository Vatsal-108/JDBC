package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String url = "jdbc:postgresql://localhost:5432/softdb";
	//	String username="soft";
	//	String password="soft123";
		Connection con=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Id:");
		int ProductId=sc.nextInt();
		System.out.println("Enter Product Name:");
		String ProductName=sc.next();
		System.out.println("Enter Product Price:");
		float productPrice=sc.nextFloat();
		sc.close();
		
		try {
			// con=DriverManager.getConnection(url, username, password);
			con=DBUtil.getconnection();
			System.out.println("Connected");
			
			String sql = "insert into product values(?,?,?)";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1,ProductId);
			ps.setString(2,ProductName);
			ps.setFloat(3,productPrice);
			
			ps.executeUpdate();
			System.out.println("Product Saved");
			
			}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
