package com.wirpro.multi_threads;

public class Orders implements Runnable {
	private Kitchen kitchen;
	private String dishName;
	private int prepTime;
	
	public Orders(Kitchen kitchen, String dishName, int prepTime) {
		System.out.println("Order accepted");
		this.kitchen = kitchen;
		this.dishName = dishName;
		this.prepTime = prepTime;
	}


	public void run() {
		kitchen.prepareDish(dishName, prepTime);
	}

}
