package com.wirpro.multi_threads;

public class Kitchen {

	public synchronized void prepareDish(String dishName , int prepTime) {
		try {
			System.out.println("Preparing " + dishName + " takes " + prepTime + " ms");
			Thread.sleep(prepTime);
			System.out.println("Dish is ready");
		}catch(InterruptedException ie) {
			System.out.println("Error in preparing " + dishName + " " + ie.getMessage());
		}
	}
}
