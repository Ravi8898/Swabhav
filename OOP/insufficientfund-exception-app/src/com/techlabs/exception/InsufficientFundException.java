package com.techlabs.exception;

public class InsufficientFundException extends RuntimeException {
	private String message;

	public InsufficientFundException(Account account) {
		message = ("Acc no." + account.getAccNo() + ", Acc Holder name. " + account.getHolderName()
				+ ", Remaining balance " + account.getBalance() + " and try to withdraw " + account.getAmount()
				+ "from ICICI bank\nPlease maintain the minimum balance because it has Insufficient Fund\nThank YOU...!!!");
	}

	@Override
	public String getMessage() {
		return message;

	}
}
