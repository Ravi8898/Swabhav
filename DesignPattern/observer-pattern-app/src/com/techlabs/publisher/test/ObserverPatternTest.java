package com.techlabs.publisher.test;

import com.techlabs.publisher.Account;
import com.techlabs.subscriber.EmailObserver;
import com.techlabs.subscriber.SmsObserver;

public class ObserverPatternTest {

	public static void main(String[] args) {

		Account acc1 = new Account(101, "abc", 5000);
		acc1.deposit(100);
		SmsObserver SmsObserver1 = new SmsObserver();
		EmailObserver emailObserver1 = new EmailObserver();
		acc1.addSubscriber(SmsObserver1);
		acc1.addSubscriber(emailObserver1);
		acc1.deposit(100);
		acc1.removeSubscriber(emailObserver1);
		acc1.withdraw(200);
	}

}
