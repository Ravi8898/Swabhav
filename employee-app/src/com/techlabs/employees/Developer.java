package com.techlabs.employees;

public class Developer extends Employee {

	static final double developerBasicSalary = 250;
	private double salPA;
	private double salIncentives;

	public Developer(String developerName) {
		this(developerName, developerBasicSalary);
	}

	public Developer(String developerName, double basicSalary) {
		super(developerName, basicSalary);
		calculatePA();
		calculateIncentives();
		totalSalary();
	}

	public void calculatePA() {

		this.salPA = (basicSalary * 0.4);
	}

	public void calculateIncentives() {

		this.salIncentives = (basicSalary * 0.3);
	}

	@Override
	public void totalSalary() {
		this.totalSalary = salPA + salIncentives + basicSalary;

	}

	public double getSalPA() {
		return salPA;
	}

	public double getSalIncentives() {
		return salIncentives;
	}

}
