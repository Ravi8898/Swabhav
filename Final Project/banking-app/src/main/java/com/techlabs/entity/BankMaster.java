package com.techlabs.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID accNo;
	
	private String name;
	private String password;
	private double balance;
	
	public UUID getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
