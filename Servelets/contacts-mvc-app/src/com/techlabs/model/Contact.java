package com.techlabs.model;

public class Contact {

	private String firstName;
	private String lastName;
	private int contactNo;
	private String emailId;

	public Contact(String firstName, String lastName, int contactNo, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	

}
