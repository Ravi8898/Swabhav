package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class FixedDepositViolationTest {

	public static void main(String[] args) {

		FixedDeposit fixedDeposit=new FixedDeposit("Ravi", 100000, 10, FestivalType.NEWYEAR);
		System.out.println("Simple Intreset is: "+fixedDeposit.calculateSimpleIntrest());
	}
}
