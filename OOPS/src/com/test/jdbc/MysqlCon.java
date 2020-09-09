package com.test.jdbc;

import java.sql.*;

class MysqlCon {
	public static void main(String args[]) {
		try {
			//register driver
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/javaclass";
			//create connection
			Connection con = DriverManager.getConnection(url, "root", "root");
			//create statement
			Statement stmt = con.createStatement();
			//create resultset
			ResultSet rs = stmt.executeQuery("select * from Employee");
			
			//fetching Database records
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"  "+rs.getString(4)+" "+rs.getString(5));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}