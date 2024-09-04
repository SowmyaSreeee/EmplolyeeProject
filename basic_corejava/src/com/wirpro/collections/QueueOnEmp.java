package com.wirpro.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOnEmp {
	
	private Queue<Employee> que;
	
	public QueueOnEmp() {
		que = new LinkedList<>();
	}
	
	public void addElmt(Employee e) {
		que.add(e);
		System.out.println("Element added " + e);
	}
	
	public void updateElmt(Employee eOld , Employee eNew) {
		if(que.contains(eOld)) {
			Queue<Employee> temp = new LinkedList<>();
			while(!que.isEmpty()) {
				Employee item = que.poll();
				if(item.equals(eOld)) {
					temp.add(eNew);
				}
				else
					temp.add(item);
			}
			que = temp;
			System.out.println("Updated: " + eOld + " to " + eNew);
		}
		else
			System.out.println("Element not found: " + eOld);
	}
	
	public void dltElmt(Employee e) {
		if(que.remove(e))
			System.out.println("Element deleted: " + e);
		else
			System.out.println("Element not found");
	}
	
	public void listElmts() {
		if(que.isEmpty())
			System.out.println("Queue is empty");
		else {
			System.out.println("Queue Elements are: ");
			for(Employee e : que)
				System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		QueueOnEmp queEmp = new QueueOnEmp();
		
		queEmp.addElmt(new Employee(101 , "Sneha"));
		queEmp.addElmt(new Employee(102 , "Neha"));
		queEmp.addElmt(new Employee(103 , "Joseph"));
		
		queEmp.updateElmt(new Employee(101 , "Sneha"), new Employee(101 , "Raju"));
		
		queEmp.listElmts();
		
		queEmp.dltElmt(new Employee(101 , "Raju"));
		
		queEmp.listElmts();
	}

}

