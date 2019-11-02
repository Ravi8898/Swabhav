package com.techlabs.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			DriverManager.setLoginTimeout(1);
			conn = DriverManager.getConnection("jdbc:mysql://localhost/swabhav?user=root&password=root");
			Statement statement = conn.createStatement();

			String q = "Select * from DEPT";
			ResultSet resultset = statement.executeQuery(q);
			
			if(resultset.next()){ 
				do{
				System.out.println(resultset.getInt("DEPTNO")+" "+resultset.getString("LOC")+" "+resultset.getString("DNAME"));
				}while(resultset.next());
			}
			else{
				System.out.println("Record Not Found...");
			}

		}
		
		catch (SQLException e) {
			e.printStackTrace();
		} 
		
		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
