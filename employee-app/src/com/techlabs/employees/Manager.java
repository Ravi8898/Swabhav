package com.techlabs.employees;

public class Manager extends Employee {
	private double salHRA;
	private double salTA;
	private double salDA;

	static final double managerBasicSalary = 500;

	public Manager(String managerName) {
		this(managerName, managerBasicSalary);
	}

	public Manager(String managerName, double basicSalary) {
		super(managerName, basicSalary);
		calculateHRA();
		calculateTA();
		calculateDA();
		totalSalary();
	}

	public void calculateHRA() {

		this.salHRA = (basicSalary * 0.5);
	}

	public void calculateTA() {

		this.salTA = (basicSalary * 0.4);
	}

	public void calculateDA() {

		this.salDA = (basicSalary * 0.3);
	}

	@Override
	public void totalSalary() {
		totalSalary = salHRA + salTA + salDA + basicSalary;

	}

	public double getSalHRA() {
		return salHRA;
	}

	public double getSalTA() {
		return salTA;
	}

	public double getSalDA() {
		return salDA;
	}

}
