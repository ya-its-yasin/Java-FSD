package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbc {

	public static void main(String[] args) {
		
		//1. establish connection - needs 3 things - url, username, password of database
		//2. obtain statement reference
		//3. prepare sql statement as string
		//4. execute statement
		//5. fetch results
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Root123$");
			System.out.println("Connected");
			
			Statement st = con.createStatement();
			String s1 = "Select * from EMP";
			ResultSet rs = st.executeQuery(s1);
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnName(1) + " " + rsmd.getColumnName(2));
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
