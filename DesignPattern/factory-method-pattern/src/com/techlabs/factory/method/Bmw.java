package com.techlabs.factory.method;

class Bmw implements IAuto{

	@Override
	public void start() {
		System.out.println("BMW starts...");
	}

	@Override
	public void stop() {
		System.out.println("BMW stop...");
	}

}
