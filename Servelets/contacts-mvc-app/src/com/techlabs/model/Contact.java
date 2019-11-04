package com.techlabs.model;

public class Contact {
	
	private int contactId;
	private String firstName;
	private String lastName;
	
	private String contactNo;
	private String emailId;

	public Contact(String firstName, String lastName, String contactNo, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.emailId = emailId;
	}

	public Contact(int contactId, String firstName, String lastName, String contactNo, String emailId) {
		this(firstName, lastName, contactNo, emailId);
		this.contactId=contactId;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public int getContactId() {
		return contactId;
	}
}
