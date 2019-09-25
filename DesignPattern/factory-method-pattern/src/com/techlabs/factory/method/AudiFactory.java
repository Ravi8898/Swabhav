package com.techlabs.factory.method;


public class AudiFactory implements IAutoFactory {

	
private static AudiFactory singleton;
	
	private AudiFactory() {
		
		System.out.println("Inside Audi Factory");
	}
		
	
	public static AudiFactory getInstance() {
		if(singleton==null)
			singleton= new AudiFactory();
		return singleton;
	}
	@Override
	public IAuto make() {
		return new Audi();
	}
	
	
}
