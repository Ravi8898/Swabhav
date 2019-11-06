package com.techlabs.service;

import java.util.List;

import com.techlabs.model.BankMaster;
import com.techlabs.model.BankTxn;
import com.techlabs.repository.BankRepository;

public class BankService {

	private static BankService instance;
	BankRepository bankRepository = new BankRepository();

	public static BankService getInstance() {
		if (instance == null)
			instance = new BankService();
		return instance;
	}

	private BankService() {
		System.out.println("this is Bank service");

	}

	public void addAccount(BankMaster bankMaster, BankTxn bankTxn) {
		bankRepository.addAccount(bankMaster, bankTxn);
				
	}

	public boolean validate(String userName, String password) {
		
		return bankRepository.validate(userName, password);
	}

	public double getBalance(String name) {
		return bankRepository.getBalance(name);
	}

	public void updateAccount(BankTxn bankTxn) {
		bankRepository.updateAccount(bankTxn);
		
	}

	public List<BankTxn> get(String userName) {
		return bankRepository.get(userName);
	}
	
}
