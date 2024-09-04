package com.wirpro.multi_threads;

public class MultiThreadRunnable implements Runnable{

	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is using ruunnable interface");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
