package com.wirpro.multi_threads;

public class SleepTester extends Thread{
	public void run() {
		for(int i = 1 ; i<= 5 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " from " + Thread.currentThread().getName());
		}	
	}

	public static void main(String[] args) {
		SleepTester s1 = new SleepTester();
		SleepTester s2 = new SleepTester();
		
		s1.start();	s2.start();		
	}
}
