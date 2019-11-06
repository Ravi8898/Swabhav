package com.techlabs.model;

import java.sql.Date;

public class BankTxn {
	
	private String name;
	private double amount;
	private String txnType;
	private Date txnDate;
	
	public BankTxn(String name, double amount, String txnType, Date txnDate) {
		
		this.name=name;
		this.amount=amount;
		this.txnType=txnType;
		this.txnDate=txnDate;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public String getTxnType() {
		return txnType;
	}

	public Date getTxnDate() {
		return txnDate;
	}
	
	
}
