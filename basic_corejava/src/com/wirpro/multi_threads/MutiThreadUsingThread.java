package com.wirpro.multi_threads;

public class MutiThreadUsingThread extends Thread{
	
	public void run() {
		try {
			System.out.println("thread " + this.getName() +" 	" +  Thread.currentThread().getId() + " is running");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
