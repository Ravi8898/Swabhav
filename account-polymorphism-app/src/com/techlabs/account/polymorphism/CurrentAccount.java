package com.techlabs.account.polymorphism;

public class CurrentAccount extends Account {
	private final static double CREDITAMOUNT = 2000;
	private double remainingCredit = CREDITAMOUNT;

	public CurrentAccount(String name, String accNo) {
		this(name, accNo, 0);
	}

	public CurrentAccount(String name, String accNo, double balance) {
		super(name, accNo, balance);
	}

	@Override
	public void deposit(double amount) {

		super.deposit(amount);
		if (remainingCredit < CREDITAMOUNT) {
			remainingCredit = remainingCredit + amount;
		}
		limitCredit();
		System.out.println("Remaining Credit Amount: " + remainingCredit);
		
	}

	@Override
	public void withdraw(double amount) {
		double updatedBalance = balance - amount;
		remainingCredit = CurrentAccount.CREDITAMOUNT + updatedBalance;
		limitCredit();
		if (remainingCredit >= 0) {
			balance = updatedBalance;
			System.out.println("Withdrawal successful...!!!");
		} else {
			System.out.println(
					"Sorry...!!! \nYou are try to withdraw more than Credit amount \nYou Don't have Enough credit amount");
		}
		System.out.println("Remaining Credit Amount: " + remainingCredit);

	}
	public void limitCredit() {
		if (remainingCredit > CREDITAMOUNT) {
			remainingCredit = CREDITAMOUNT;
		}
	}
}
