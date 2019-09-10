package com.techlabs.employees;

public class Analyst extends Employee {

	static final double analystBasicSalary = 200;
	private double perks;
	private double bonus;

	public Analyst(String analystName) {
		this(analystName, analystBasicSalary);
	}

	public Analyst(String analystName, double basicSalary) {
		super(analystName, basicSalary);
		calculatePerks();
		calculateBonus();
		totalSalary();
	}

	public void calculatePerks() {
		this.perks = (basicSalary * 0.3);
	}

	public void calculateBonus() {
		this.bonus = (basicSalary * 0.2);
	}

	@Override
	public void totalSalary() {
		this.totalSalary = perks + bonus + basicSalary;

	}

	public double getPerks() {
		return perks;
	}

	public double getBonus() {
		return bonus;
	}

}
