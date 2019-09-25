package com.techlabs.factory.method;

public class TeslaFactory implements IAutoFactory {

		private static TeslaFactory singleton;
			
			private TeslaFactory() {
				System.out.println("Inside Audi Factory");
			}
				
			
			public static TeslaFactory getInstance() {
				if(singleton==null)
					singleton= new TeslaFactory();
				return singleton;
			}
	
	@Override
	public IAuto make() {
		
		return new Tesla();
	}

}
