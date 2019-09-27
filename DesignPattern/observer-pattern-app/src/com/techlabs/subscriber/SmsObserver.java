package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceChangeObserver;

public class SmsObserver implements IBalanceChangeObserver {

	@Override
	public void update(Account account) {
		System.out.println("---------Through Sms------------\nName: " + account.getName() + "\nAcoountNo: "
				+ account.getAccountNo() + "\nBalance is: " + account.getBalance());
		System.out.println();

	}

}
