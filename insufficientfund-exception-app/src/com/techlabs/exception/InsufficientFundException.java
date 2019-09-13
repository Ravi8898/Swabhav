package com.techlabs.exception;

public class InsufficientFundException extends RuntimeException{
	
	public InsufficientFundException(Account account) {
		System.out.println( account.getAccNo()+" "+account.getHolderName()+" ");
	}
}
