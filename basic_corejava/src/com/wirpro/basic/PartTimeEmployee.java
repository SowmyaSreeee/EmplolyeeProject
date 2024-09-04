package com.wirpro.basic;

import com.wirpro.collections.Employee;

public class PartTimeEmployee extends Employee{

	private double hourlyRate;
	private double hoursWorked;
	
	public PartTimeEmployee(Long id, String name, double hourlyRate, double hoursWorked) {
		super(id, name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	
	public double getHourlyRate() {
		return hourlyRate;
	}


	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


	public double getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public double calcSalary() {
		return hourlyRate*hoursWorked;
	}
}
