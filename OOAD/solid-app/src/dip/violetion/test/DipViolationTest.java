package dip.violetion.test;

import dip.violetion.LogType;
import dip.violetion.TaxCalculator;

public class DipViolationTest {

	public static void main(String[] args) {

		TaxCalculator calc=new TaxCalculator(LogType.XML);
		System.out.println(calc.calculateTax(20, 0));
//		System.out.println(calc.calculateTax(20, 6));
	}

}
