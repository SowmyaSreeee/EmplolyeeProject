package com.wirpro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employeetest {
	public static void main(String[] args) {
		
		List<Employee> al = new ArrayList<Employee>();
		
		Employee e1 = new Employee(101 , "Joseph" , 32000);
		Employee e2 = new Employee(102 , "Shinchan" , 23000);
		Employee e3 = new Employee(103 , "Himawari" , 33000);
		Employee e4 = new Employee(104 , "Kazama" , 45000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Collections.sort(al, new Employee());
	}

}
