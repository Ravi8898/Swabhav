package dip.solution.test;

import dip.solution.FileLogger;
import dip.solution.TaxCalculator;
import dip.solution.XMLLogger;

public class DipSolutionTest {

	public static void main(String[] args) {

		TaxCalculator calc=new TaxCalculator(new FileLogger());
		System.out.println(calc.calculateTax(20, 0));
//		System.out.println(calc.calculateTax(20, 6));
		
		TaxCalculator calc1=new TaxCalculator(new XMLLogger());
		System.out.println(calc1.calculateTax(20, 0));
	}

}
