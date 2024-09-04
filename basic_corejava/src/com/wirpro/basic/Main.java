package com.wirpro.basic;

import com.wirpro.collections.Employee;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new FTE(101 , "Shinchan", 60000);
		Employee e2 = new PartTimeEmployee(101l , "Shinchan", 1000 , 6);
		
		System.out.println(e1.getName()+ e1.getAnnualSalary());
	}
}
