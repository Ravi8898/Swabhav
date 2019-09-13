package com.techlabs.exception;

public class Account {

	private String accNo;
	private String holderName;
	private double balance;
	private static final double MIN_AMOUNT = 500;

	public Account(String accNo, String holderName) {

		this(accNo, holderName, MIN_AMOUNT);

	}

	public Account(String accNo, String holderName, double balance) {

		this.accNo = accNo;
		this.holderName = holderName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Amount is Deposited in your account. \nThank You..!!!");
	}

	public void withdraw(double amount) {

		double updatedBalance = this.balance - amount;
		if (updatedBalance >= MIN_AMOUNT && amount >= MIN_AMOUNT) {
			this.balance = updatedBalance;
			System.out.println("Withdrawal successful...!!!");
		} else if (amount < MIN_AMOUNT) {
			System.out.println("Enter the withdrawal amount more than or equal to 500");

		} else {
			throw new RuntimeException("Not Enough balance or Balance is less than 500");
		}

	}

	public String getAccNo() {
		return accNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}
}
