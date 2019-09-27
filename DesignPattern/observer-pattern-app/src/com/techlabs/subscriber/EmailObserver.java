package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceChangeObserver;

public class EmailObserver implements IBalanceChangeObserver {

	@Override
	public void update(Account account) {
		System.out.println("---------Through Email------------\nName: " + account.getName() + "\nAcoountNo: " + account.getAccountNo() + "\nBalance is: "
				+ account.getBalance());
		System.out.println();

	}

}
