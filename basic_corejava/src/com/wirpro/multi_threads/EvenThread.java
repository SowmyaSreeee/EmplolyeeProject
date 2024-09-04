package com.wirpro.multi_threads;

public class EvenThread implements Runnable{

	private int a;
	private int b;
	
	
	public EvenThread(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

 
	@Override
	public void run() {
		for(int i = a ; i < b ; i++) {
			if(i % 2 == 0) {
				System.out.println("Thread " + Thread.currentThread().getName() + " even number is " + i);
			}
		}
	}
}
