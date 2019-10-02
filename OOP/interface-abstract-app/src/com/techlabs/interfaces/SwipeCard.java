package com.techlabs.interfaces;

public class SwipeCard implements AtmMachine{

	@Override
	public void withdraw() {
		
		System.out.println("Enter the amount");
	}

	@Override
	public void miniStatement() {
		
		System.out.println("Please collect your statement");
	}

	@Override
	public void checkBalance() {
		
		System.out.println("Your Balance Amnt. is: **** INR");
	}
	
}
