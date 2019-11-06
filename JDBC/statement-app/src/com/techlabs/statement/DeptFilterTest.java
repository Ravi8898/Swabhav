package com.techlabs.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptFilterTest {
	
	public static void main(String[] args) {

		Connection conn = null;
		try {
			DriverManager.setLoginTimeout(1);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter dept No.: ");
			String deptNo = scanner.nextLine();
			PreparedStatement statement = conn.prepareStatement("Select * from DEPT Where DEPTNO=?");

			statement.setString(1, deptNo);
//			String q = "Select * from DEPT Where DEPTNO="+deptNo;
//			statement.executeUpdate();

			ResultSet resultset = statement.executeQuery();

			if (resultset.next()) {
				do {
					System.out
							.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getString(3));
				} while (resultset.next());
			} else {
				System.out.println("Record Not Found...");
			}
			scanner.close();

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
