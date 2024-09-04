package com.wirpro.multi_threads;

public class Restaurant {

	public static void main(String[] args) {
		Kitchen kitchen = new Kitchen();
		
		Thread[] orderDish = new Thread[5];
		
		// Running loop for 5 orders
		for(int i = 0 ; i < orderDish.length ; i++) {
			String dishname = "Dish" + (i+1);
			int prepTime = 500 * (i+1);
			
			orderDish[i] = new Thread(new Orders(kitchen , dishname , prepTime));
			orderDish[i].start();
		}
			
			for(Thread t : orderDish) {
				try {
					t.join();
				} catch(InterruptedException e) {
					System.out.println("Thread interupted: " + e.getMessage());
				}
			}
		System.out.println("All orders have been processed");
	}
}
