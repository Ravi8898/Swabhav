package com.techlabs.college;

public class Person {

	private int id;
	private static int nextID;
	protected String address;
	protected String dob;

	static {

		nextID = 1000;
	}

	public Person(String address, String dob) {
		
		id = ++nextID;
		
		this.address = address;
		this.dob = dob;

	}

	public int getId() {
		return id;
	}

	public static int getNextID() {
		return nextID;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}

}
