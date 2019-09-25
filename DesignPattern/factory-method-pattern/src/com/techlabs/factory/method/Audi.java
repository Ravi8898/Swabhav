package com.techlabs.factory.method;

class Audi implements IAuto{

	@Override
	public void start() {
		System.out.println("AUDI starts...");
	}

	@Override
	public void stop() {
		System.out.println("AUDI stops...");
	}

}
