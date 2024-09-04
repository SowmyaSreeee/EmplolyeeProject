package com.wirpro.basic;

import com.wirpro.collections.Employee;

public class FTE extends Employee{

	private double annualSalary;
	
	public FTE(long id , String name, double annualSalary) {
		super(id , name);
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double calcSalary() {
		return annualSalary;
	}
}
