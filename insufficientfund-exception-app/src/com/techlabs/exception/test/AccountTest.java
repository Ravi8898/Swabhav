package com.techlabs.exception.test;

import com.techlabs.exception.Account;
import com.techlabs.exception.InsufficientFundException;

public class AccountTest {

	public static void main(String[] args) {

		Account account1 = new Account("123", "Ravi");
		Account account2 = new Account("231", "Sunny", 5000);
		account1.deposit(5000);
		printInfo(account1);
		try {
			account2.withdraw(5501);
			printInfo(account2);
		} catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void printInfo(Account account) {
		System.out.println("Name of the Account Holder: " + account.getHolderName());
		System.out.println("Account Number: " + account.getAccNo());
		System.out.println("Balance amount: " + account.getBalance());
		System.out.println();
	}
}
