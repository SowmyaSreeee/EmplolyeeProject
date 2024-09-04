package com.wirpro.basic;

import java.util.Comparator;
import java.util.Objects;

public class Employee<T> implements Comparator<T>{
	private long id;
	private String name;
	

	public Employee(long id ,String name) {
		this.id = id;
		this.name = name;
		
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
		return Objects.hash(id, name);
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
		return id == other.id && Objects.equals(name, other.name);
	}

	public void display() {
		System.out.println(id + "," + name);
	}

	public double calcSalary() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int compare(T o1, T o2) {
//		Employee e1 = (Employee)o1;
//		Employee e2 = (Employee)o2;
//		
//		if(e1.salary == e2.salary)
//			return 0;
//		else if(e1.salary > e2.salary)
//			return -1;
//		else 
//			return 1;
//		
//	}
}
