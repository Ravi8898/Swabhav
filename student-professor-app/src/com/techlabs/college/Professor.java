package com.techlabs.college;

import com.techlabs.person.salarized.employee.SalarizedEmployee;

public class Professor extends Person implements SalarizedEmployee {

	private double salary;
	private static final double SALARY_PER_DAY = 1500;

	public Professor(String address, String dob, double workingHours, int workingDays) {
		super(address, dob);
		calculateSalary(workingDays);

	}

	public double getSalary() {
		return salary;
	}

	@Override
	public void calculateSalary(int workingDays) {

		salary = workingDays * SALARY_PER_DAY;
	}

}
