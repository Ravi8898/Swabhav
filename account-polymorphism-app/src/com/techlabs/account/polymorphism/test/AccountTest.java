package com.techlabs.account.polymorphism.test;

import com.techlabs.account.polymorphism.Account;
import com.techlabs.account.polymorphism.CurrentAccount;
import com.techlabs.account.polymorphism.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		Account savingAccount1 = new SavingAccount("Ravi", "123", 5000);
		Account currentAccount1 = new CurrentAccount("Sunny", "231", 10000);
		Account currentAccount2 = new CurrentAccount("Durga", "153");

//		savingAccount1.deposit(2500);
//		printInfo(savingAccount1);
//		savingAccount1.withdraw(7400);
//		printInfo(savingAccount1);

		currentAccount1.deposit(1000);
		printInfo(currentAccount1);
		currentAccount1.withdraw(13000);
		printInfo(currentAccount1);
		currentAccount1.deposit(20000);
		printInfo(currentAccount1);
		currentAccount1.withdraw(1000);
		printInfo(currentAccount1);

//		currentAccount2.withdraw(2000);
//		printInfo(currentAccount2);
	}

	public static void printInfo(Account account) {
		System.out.println("Account holder name: " + account.getName());
		System.out.println("Account number: " + account.getAccNo());
		System.out.println("Balance amount: " + account.getBalance());
		System.out.println();
	}

}
