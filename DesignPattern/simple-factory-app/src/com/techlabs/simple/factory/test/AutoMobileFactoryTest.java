package com.techlabs.simple.factory.test;

import com.techlabs.simple.factory.AutoMobileFactory;
import com.techlabs.simple.factory.AutoType;
import com.techlabs.simple.factory.IAutomobile;

public class AutoMobileFactoryTest {

	public static void main(String[] args) {
		
		AutoMobileFactory factory=AutoMobileFactory.getInstance();
		IAutomobile auto=factory.make(AutoType.BMW);
		auto.start();
		auto.stop();
		System.out.println(auto.getClass());
		System.out.println(factory.hashCode());
		
		AutoMobileFactory factory1=AutoMobileFactory.getInstance();
		System.out.println(factory1.hashCode());
	}

}
