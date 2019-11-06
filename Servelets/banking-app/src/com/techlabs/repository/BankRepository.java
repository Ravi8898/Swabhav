package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.BankMaster;
import com.techlabs.model.BankTxn;

public class BankRepository {

	Connection conn = null;

	public void addAccount(BankMaster bankMaster, BankTxn bankTxn) {

		getConnection();
		try {

			conn.setAutoCommit(false);

			PreparedStatement statement = conn
					.prepareStatement("INSERT INTO bankmaster(name, pswd, balance) VALUES (?,?,?)");

			statement.setString(1, bankMaster.getName());
			statement.setString(2, bankMaster.getPassword());

			statement.setDouble(3, bankMaster.getBalance());
			statement.executeUpdate();

			PreparedStatement statement1 = conn
					.prepareStatement("INSERT INTO banktxn (name, amount, txntype, txndate) VALUES (?,?,?,?)");

			statement1.setString(1, bankTxn.getName());
			statement1.setDouble(2, bankTxn.getAmount());

			statement1.setString(3, bankTxn.getTxnType());
			statement1.setDate(4, bankTxn.getTxnDate());
			statement1.executeUpdate();

			conn.commit();
			System.out.println("Account Added successfully...!!!");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public boolean validate(String userName, String password) {

		String dbUsername, dbPassword;
		getConnection();

		try {
			conn.setAutoCommit(false);
			PreparedStatement statement = conn.prepareStatement("SELECT name,pswd FROM bankmaster");

			statement.execute();
			ResultSet resultSet = statement.getResultSet();

			while (resultSet.next()) {
				dbUsername = resultSet.getString("name");
				dbPassword = resultSet.getString("pswd");

				if (dbUsername.equals(userName) && dbPassword.equals(password)) {
					System.out.println("OK");
//					System.out.println("Inside validation" + userName + password + " " + dbUsername + dbPassword);

					return true;
				}
			}
			conn.commit();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public double getBalance(String name) {

		getConnection();
		double userBal = 0;
		try {
			Statement statement = conn.createStatement();
			statement.executeQuery("SELECT balance FROM bankmaster WHERE name='" + name + "'");
			ResultSet resultSet = statement.getResultSet();

			if (resultSet.next())
				userBal = resultSet.getDouble(1);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return userBal;
	}

	public void updateAccount(BankTxn bankTxn) {

		getConnection();
		try {
			
			System.out.println("Inside update account");
			conn.setAutoCommit(false);
			String sqlQuery = null;
			if (bankTxn.getTxnType().equals("D")) {
				sqlQuery = "UPDATE bankmaster SET balance=balance+? where name=?";

			}

			if (bankTxn.getTxnType().equals("W")) {
				sqlQuery = "UPDATE bankmaster SET balance=balance-? where name=?";

			}

			PreparedStatement statement = conn.prepareStatement(sqlQuery);

			statement.setDouble(1, bankTxn.getAmount());
			statement.setString(2, bankTxn.getName());
			statement.executeUpdate();

			PreparedStatement statement1 = conn
					.prepareStatement("INSERT INTO banktxn (name, amount, txntype, txndate) VALUES (?,?,?,?)");

			statement1.setString(1, bankTxn.getName());
			statement1.setDouble(2, bankTxn.getAmount());

			statement1.setString(3, bankTxn.getTxnType());
			statement1.setDate(4, bankTxn.getTxnDate());
			statement1.executeUpdate();

			conn.commit();
			System.out.println("Transaction Completed successfully...!!!");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public List<BankTxn> get(String userName) {
		getConnection();
		List<BankTxn> txnList = new ArrayList<BankTxn>();
		BankTxn bankTxn;
		try {
			PreparedStatement statement = conn.prepareStatement("select * from banktxn where name=?");
			statement.setString(1, userName);
			ResultSet results = statement.executeQuery();
			
			if (results.next())
				do {
//					System.out.println(results.getInt(1) + "," + results.getString(2) + "," + results.getString(3) + ","
//							+ results.getString(4) + "," + results.getString(5));
					bankTxn = new BankTxn(results.getString(1), results.getDouble(2), results.getString(3),
							results.getDate(4));
					txnList.add(bankTxn);

				} while (results.next());
			else
				System.out.println("Record Not Found");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return txnList;

	}

}
