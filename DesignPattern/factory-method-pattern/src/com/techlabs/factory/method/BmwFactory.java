package com.techlabs.factory.method;

public class BmwFactory implements IAutoFactory{

	private static BmwFactory singleton;
	
	private BmwFactory() {
		System.out.println("Inside Audi Factory");
	}
		
	
	public static BmwFactory getInstance() {
		if(singleton==null)
			singleton= new BmwFactory();
		return singleton;
	}
	
	@Override
	public IAuto make() {
		
		return new Bmw();
	}

}
