package com.test.jdbc;

import java.sql.*;

class FetchRecord {
	public static void main(String args[]) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass", "root", "root");
		Statement stmt = con.createStatement();
		//String query1="insert into Employee values(14, 'xyz', 'abc', 'nashik', 'nashik')";
    	String query2="update Employee set City='Nagar' where EmpID=14 ";
		
	     //stmt.executeUpdate(query1);
		int result=stmt.executeUpdate(query2);
		//int result = stmt.executeUpdate("delete from Employee where EmpID=13");
		System.out.println(result + " records affected");
		con.close();
	}
}
