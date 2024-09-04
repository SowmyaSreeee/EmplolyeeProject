package com.wirpro.multi_threads;

public class EvenThreadTester {

	public static void main(String[] args) {

		Thread t = new Thread(new EvenThread(0,5));
		t.start();	
		
		Thread t1 = new Thread(new EvenThread(10,15));
		t1.start();	
		
		Thread t2 = new Thread(new EvenThread(10,25));
		t2.start();	
	}
}
