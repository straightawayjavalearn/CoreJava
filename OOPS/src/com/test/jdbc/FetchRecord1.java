package com.test.jdbc;

import java.sql.*;

class FetchRecord1 {
	public static void main(String args[]) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass", "root", "root");
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("select * from Employee");

		// getting the record of 3rd row
		rs.absolute(1);
		System.out.println(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));

		con.close();
	}
}
