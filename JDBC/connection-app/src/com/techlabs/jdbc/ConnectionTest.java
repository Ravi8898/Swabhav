package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			DriverManager.setLoginTimeout(1);
			conn = DriverManager.getConnection("jdbc:mysql://localhost/swabhav?user=root&password=root");

			System.out.println(conn.getClass());
			System.out.println("Connection Stablished Successfully...!!!");
			System.out.println(DriverManager.getLoginTimeout());
//			System.out.println("Timeout: " + conn.getNetworkTimeout());
//			conn.setNetworkTimeout(executor, milliseconds);
			System.out.println("db:" + conn.getCatalog() + "\n" + "userName: " + conn.getMetaData().getUserName()
					+ "\nPassword: ");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
