package com.techlabs.customer;

public class Customer {
	
	private String firstName;
	private String lastName;
	private int customerID;
	private static int nextID;
	static {
		nextID=1000;
	}
	public Customer(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		customerID=++nextID;	
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getCustomerID() {
		return customerID;
	}

}
