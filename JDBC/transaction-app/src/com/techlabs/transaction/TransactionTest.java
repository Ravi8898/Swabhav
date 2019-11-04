package com.techlabs.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionTest {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
			conn.setAutoCommit(false);
			
			PreparedStatement statement1 = conn.prepareStatement("UPDATE customers SET customerBalance=customerBalance-5000 WHERE customerId=?");
			statement1.setInt(1, 1);
			statement1.executeUpdate();
			
			PreparedStatement statement2 = conn.prepareStatement("UPDATE merchant SET merchantBalances=merchantBalance+5000 WHERE merchantId=?");
			statement2.setInt(1, 2);
			statement2.executeUpdate();
			
			conn.commit();
			System.out.println("Transaction successful...!!!");
		}catch(SQLException e) {
			try {
				System.out.println("Transaction failed...!!!");
				conn.rollback();
			} catch (SQLException e1) {
				System.out.println("Transaction failed...!!!");
				e1.printStackTrace();
			}
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				}catch (SQLException e1) {
					e1.printStackTrace();
			}
		}

	}

}
