package com.techlabs.simple.factory;


public class AutoMobileFactory {

	private static AutoMobileFactory bucket;
	
	private AutoMobileFactory() {
		System.out.println("Inside AutoMobile Factory");
	}
	
	public static AutoMobileFactory getInstance() {
		if(bucket==null)
			bucket= new AutoMobileFactory();
		return bucket;
	}
	public IAutomobile make(AutoType auto) {
		if (auto.equals(AutoType.BMW))
			return new Bmw();
		else if (auto.equals(AutoType.AUDI))
			return new Audi();
		else if (auto.equals(AutoType.TESLA))
			return new Tesla();
		return null;
	}
}
