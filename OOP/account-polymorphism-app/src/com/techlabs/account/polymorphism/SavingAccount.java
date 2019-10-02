package com.techlabs.account.polymorphism;

public class SavingAccount extends Account {

	private static final double MINBALANCE = 500;

	public SavingAccount(String name, String accNo) {
		this(name, accNo, MINBALANCE);
	}

	public SavingAccount(String name, String accNo, double balance) {
		super(name, accNo, balance);
	}

	@Override
	public void withdraw(double amount) {

		double updatedBalance = balance - amount;
		if (updatedBalance >= SavingAccount.MINBALANCE && amount >= SavingAccount.MINBALANCE) {
			balance = updatedBalance;
			System.out.println("Withdrawal successful...!!!");
		} else if (amount < MINBALANCE)
			System.out.println("Enter the withdrawal amount more than or equal to 500");
		else
			System.out.println("Not enough Balance in your accont \nor \nMaintain the minimum amount of 500");

	}

}
