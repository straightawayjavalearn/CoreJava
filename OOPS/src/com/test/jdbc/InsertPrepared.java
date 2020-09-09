package com.test.jdbc;

import java.sql.*;

class InsertPrepared {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass", "root", "root");
			PreparedStatement stmt = con.prepareStatement("insert into Employee values(?,?,?,?,?)");
			stmt.setInt(1, 20); // 1 specifies the first parameter in the query
			stmt.setString(2, "ooo");
			stmt.setString(3, "uu");
			stmt.setString(4, "gh");
			stmt.setString(5, "Dehli");
			
			int i = stmt.executeUpdate();
			con.commit();
			System.out.println(i + " records inserted");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}