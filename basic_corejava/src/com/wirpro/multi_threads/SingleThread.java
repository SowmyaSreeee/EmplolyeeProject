package com.wirpro.multi_threads;

public class SingleThread {

	public static void main(String[] args) {
		System.out.println("Task 1: starting");
		performTask(1);
		System.out.println("Task 1: completed");
		
		System.out.println("Task 2: starting");
		performTask(2);
		System.out.println("Task 2: completed");
		
		System.out.println("Task 3: starting");
		performTask(3);
		System.out.println("Task 3: completed");
		
	}

	private static void performTask(int i) {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Performing Task " + i);
	}
}
