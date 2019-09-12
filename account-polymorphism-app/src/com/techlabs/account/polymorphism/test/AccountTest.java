package com.techlabs.account.polymorphism.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.account.polymorphism.Account;
import com.techlabs.account.polymorphism.CurrentAccount;
import com.techlabs.account.polymorphism.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		List<Account> accounts = new ArrayList<Account>();
		Account savingAccount1 = new SavingAccount("Ravi", "123", 5000);
		accounts.add(savingAccount1);
		
		Account currentAccount1 = new CurrentAccount("Sunny", "231", 10000);
		accounts.add(currentAccount1);
		
		Account currentAccount2 = new CurrentAccount("Durga", "153");
		accounts.add(currentAccount2);
		
		savingAccount1.deposit(2500);

		accounts.remove(currentAccount2);
		
		currentAccount1.withdraw(2000);
				
		printInfo(accounts);
		System.out.println("No of accounts present in your bank:"+accounts.size());
	}

	public static void printInfo(List<Account> accounts) {
		
//		for(Iterator<Account> accountsIterator=accounts.iterator(); accountsIterator.hasNext();) {
//			System.out.println(accountsIterator.next());
//		}
		
		for(Account accountsList:accounts) {
			
			System.out.println(accountsList);
		}
	}

}
