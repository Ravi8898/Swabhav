package com.techlabs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	private String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double cgpi;

	public Student() {
		System.out.println("Student Constructor");
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getCgpi() {
		return cgpi;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCgpi(double cgpi) {
		this.cgpi = cgpi;
	}
	
	

}
