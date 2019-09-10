package com.techlabs.account;

public class Account {
	
	private String accNo;
	private String holderName;
	private double balance;
	private static double minAmount=500;
	
	public Account(String accNo, String holderName) {
		
		this(accNo, holderName, minAmount);
		
	}
	public Account(String accNo, String holderName, double balance) {
		
		this.accNo=accNo;
		this.holderName=holderName;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
		System.out.println("Amount is Deposited in your account. \nThank You..!!!");
	}
	
	public void withdraw(double amount) {
		
		double updatedBalance=this.balance-amount;
		if(updatedBalance>=minAmount && amount>=minAmount) {
			this.balance=updatedBalance;
			System.out.println("Withdrawal successful...!!!");
		}
		else if(amount<minAmount)
			System.out.println("Enter the withdrawal amount more than or equal to 500");
		else 
			System.out.println("Not enough Balance in your accont \nor \nMaintain the minimum amount of 500");
			
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
