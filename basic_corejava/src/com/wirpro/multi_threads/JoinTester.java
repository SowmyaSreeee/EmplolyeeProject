package com.wirpro.multi_threads;

public class JoinTester extends Thread{

	public void run() {
		for(int i = 1 ; i <= 5 ; i++) {
			try {
				Thread.sleep(500);
				
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()	+ " - " + i);
		}
	}
	public static void main(String[] args) {
		JoinTester jt1 = new JoinTester();
		JoinTester jt2 = new JoinTester();
		JoinTester jt3 = new JoinTester();
		
		jt1.start();
		try {
			jt1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		jt2.start();
		
		try {
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jt3.start();
	}
}
