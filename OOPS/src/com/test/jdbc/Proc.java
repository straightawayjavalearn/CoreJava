package com.test.jdbc;

import java.sql.*;

public class Proc {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass", "root", "root");
		CallableStatement stmt = con.prepareCall("{call GetAllEmployee()}");
		
		ResultSet rs1 = stmt.executeQuery();
		while(rs1.next()) {
			
		     System.out.print("EMP ID: "+rs1.getInt("EmpID")+", ");
	         System.out.print("FirstName: "+rs1.getString("FirstName")+", ");
	         System.out.println();
		}
		
		System.out.println("success");
	}
}