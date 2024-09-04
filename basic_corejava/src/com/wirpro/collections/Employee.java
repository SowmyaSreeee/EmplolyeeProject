package com.wirpro.collections;

import java.util.Comparator;
import java.util.Objects;

public class Employee<T> implements Comparator<T>{
	private long id;
	private String name;
	private int salary;

	public Employee(long id ,String name , int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(long id2, String name2) {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name , salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}

	public void display() {
		System.out.println(id + "," + name);
	}

	public double calcSalary() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary = "+ salary + "]";
	}

	@Override
	public int compare(T o1, T o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		if(e1.salary == e2.salary)
			return 0;
		else if(e1.salary > e2.salary)
			return -1;
		else 
			return 1;
		
	}
}
