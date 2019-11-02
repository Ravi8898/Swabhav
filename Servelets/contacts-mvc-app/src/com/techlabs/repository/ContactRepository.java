package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactRepository {

	Connection conn = null;

//	public ContactRepository() {
//		getConnection();
//
//	}

	public List<Contact> get() {
		getConnection();
		List<Contact> contactList = new ArrayList<Contact>();
		try {

			PreparedStatement statement = conn.prepareStatement("Select * from Contacts");

			System.out.println("Connection Stablished Successfully...!!!");
			ResultSet resultset = statement.executeQuery();

			if (resultset.next()) {
				do {
					contactList.add(new Contact(resultset.getString(2), resultset.getString(3), resultset.getInt(4),
							resultset.getString(5)));
					System.out.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getString(3)
							+ " " + resultset.getInt(4) + " " + resultset.getString(5));
//					contactList.add(contact);
				}

				while (resultset.next());
			} else {
				System.out.println("Record Not Found...");
			}

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
		return contactList;
	}

	public void add(Contact contact) {
		getConnection();
		try {

			PreparedStatement statement = conn.prepareStatement(
					"INSERT INTO contacts (firstName, lastName, contactNo, emailId) VALUES (?,?,?,?)");
			statement.setString(1, contact.getFirstName());
			statement.setString(2, contact.getLastName());

			statement.setInt(3, contact.getContactNo());
			statement.setString(4, contact.getEmailId());
			statement.executeUpdate();
			System.out.println("contact Added successfully...!!!");

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

	private Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}

}
