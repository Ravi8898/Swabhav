package com.techlabs.proxy;

public class ATMProxy implements GetATMData{

	public ATMState getATMState() {
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getATMState();
	}

	// Allows the user to access getCashInMachine
	// in the Object ATMMachine

	public int getCashInMachine() {
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getCashInMachine();

	}
}
