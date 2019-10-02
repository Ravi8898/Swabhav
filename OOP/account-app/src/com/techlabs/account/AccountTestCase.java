package com.techlabs.account;

import org.junit.jupiter.api.Test;

class AccountTestCase {

	private Account accountChecker = new Account("102", "ravi", 1400);

	@Test
	void testWithdraw_MinBalance() {
		try {
			accountChecker.withdraw(400);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	void testWithdraw_LowBalance() {
		try {
			accountChecker.withdraw(1000);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
