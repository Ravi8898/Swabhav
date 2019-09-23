package ocp.solution;

public class FixedDeposit {

	private String name;
	private double principal;
	private int years;
	private float rateOfIntrest;

	public FixedDeposit(String name, double principal, int years, IFestival festival) {

		this.name = name;
		this.principal = principal;
		this.years = years;
		this.rateOfIntrest = festival.getROI();
	}

	public double calculateSimpleIntrest() {

		return ((principal * years * rateOfIntrest) / 100);
	}
}
