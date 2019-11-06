package com.techlabs.model;

public class BankMaster {
	private String name;
	private String password;
	private double balance;
	
	public BankMaster(String name, String password, double balance) {
		
		this.name=name;
		this.password=password;
		this.balance=balance;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
