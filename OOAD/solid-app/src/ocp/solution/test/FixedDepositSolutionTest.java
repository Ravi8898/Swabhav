package ocp.solution.test;

import ocp.solution.FixedDeposit;
import ocp.solution.HoliFestival;

public class FixedDepositSolutionTest {

	public static void main(String[] args) {

		FixedDeposit fixedDeposit = new FixedDeposit("Ravi", 100000, 10, new HoliFestival());
		System.out.println("Simple Intrest is: "+fixedDeposit.calculateSimpleIntrest());
	}

}
