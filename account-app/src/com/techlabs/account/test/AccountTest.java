package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account1=new Account("123", "Ravi");
		Account account2=new Account("231", "Sunny", 5000);
		account1.deposit(5000);
		printInfo(account1);
		account2.withdraw(4501);
		printInfo(account2);
		}
	
	public static void printInfo(Account account) {
		System.out.println("Name of the Account Holder: "+account.getHolderName());
		System.out.println("Account Number: "+account.getAccNo());
		System.out.println("Balance amount: "+account.getBalance());
		System.out.println();
	}

}


