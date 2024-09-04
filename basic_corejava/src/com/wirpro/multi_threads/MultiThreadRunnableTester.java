package com.wirpro.multi_threads;

public class MultiThreadRunnableTester {

	public static void main(String[] args) {
		int n = 8;
		for(int i = 0 ; i < n ; i++) {
			Thread t = new Thread(new MultiThreadRunnable());
			t.start();
		}
	}
}
