package com.wirpro.multi_threads;

public class MutiThreadUsingThreadTester {
	public static void main(String[] args) {
		int n = 3;
		for(int i = 0 ; i < n ; i++) {
			MutiThreadUsingThread mt = new MutiThreadUsingThread();
			mt.start();
			mt.setName("Thread: " + i);
		}
	}
}
