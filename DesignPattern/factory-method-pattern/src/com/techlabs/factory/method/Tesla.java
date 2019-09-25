package com.techlabs.factory.method;

class Tesla implements IAuto{
	
	@Override
	public void start() {
		System.out.println("TESLA starts...");
	}

	@Override
	public void stop() {
		System.out.println("TESLA stop...");
	}

}
