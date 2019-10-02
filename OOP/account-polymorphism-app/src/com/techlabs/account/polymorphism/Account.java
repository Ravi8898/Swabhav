package com.techlabs.account.polymorphism;

public abstract class Account {

	private String name;
	private String accNo;
	protected double balance;

	public Account(String name, String accNo, double balance) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}

	public void deposit(double amount) {

		this.balance = this.balance + amount;
		System.out.println("Your amount is deposited into yout account");
	}
	
	@Override
	public String toString() {
		return "Account No: "+accNo+"\nHolder Name: "+name+"\nRemaining balance: "+balance+"\n";
		
	}

	public abstract void withdraw(double amount);

	public String getName() {
		return name;
	}

	public String getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balance;
	}

}
