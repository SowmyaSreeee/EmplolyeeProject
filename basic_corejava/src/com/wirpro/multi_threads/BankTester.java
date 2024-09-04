package com.wirpro.multi_threads;

public class BankTester {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		
		Thread user1 = new Thread(new User(account , true , 300), "user1");
		Thread user2 = new Thread(new User(account , false , 500), "user2");
		Thread user3 = new Thread(new User(account , true , 200), "user3");
		Thread user4 = new Thread(new User(account , false , 400), "user4");
		
		user1.start(); user2.start(); user3.start(); user4.start();
		
		try {
			user1.join();
			user2.join();
			user3.join();
			user4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("final Blanace is: " + account.getBalance());
	}
}
