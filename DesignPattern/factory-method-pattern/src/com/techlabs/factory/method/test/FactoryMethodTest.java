package com.techlabs.factory.method.test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.techlabs.factory.method.IAuto;
import com.techlabs.factory.method.IAutoFactory;
import com.techlabs.factory.method.PropertyFileLoader;
import com.techlabs.factory.method.TeslaFactory;

public class FactoryMethodTest {

	public static void main(String[] args)
			throws Exception {
		
		IAutoFactory factory = reflectFactory();
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
		System.out.println(factory.hashCode());
		IAutoFactory factory1=reflectFactory();
		System.out.println(factory1.hashCode());
	}

	private static IAutoFactory reflectFactory() throws Exception {
		PropertyFileLoader p = new PropertyFileLoader();
		Class factoryClass=Class.forName(p.getProperties());
		Method method=factoryClass.getMethod("getInstance");
		Object obj=method.invoke(factoryClass);
		return (IAutoFactory) obj;
				
	}
	
	

}
