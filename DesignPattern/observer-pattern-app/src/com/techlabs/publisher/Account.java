package com.techlabs.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountNo;
	private String name;
	private double balance;
	private List<IBalanceChangeObserver> subscribers;

	public Account(int accountNo, String name, double balance) {
		subscribers = new ArrayList<IBalanceChangeObserver>();
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		for (IBalanceChangeObserver observalbe : subscribers) {
			observalbe.update(this);
		}
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		for (IBalanceChangeObserver observable : subscribers) {
			observable.update(this);
		}
	}

	public void addSubscriber(IBalanceChangeObserver observalbe) {
		subscribers.add(observalbe);

	}

	public void removeSubscriber(IBalanceChangeObserver observalbe) {
		subscribers.remove(observalbe);

	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<IBalanceChangeObserver> getSubscribers() {
		return subscribers;
	}

}
