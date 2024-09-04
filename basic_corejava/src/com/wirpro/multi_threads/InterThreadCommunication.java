package com.wirpro.multi_threads;

public class InterThreadCommunication {

	public static void main(String[] args) {
        Operations buffer = new Operations(5); // Buffer capacity of 5
 
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));
 
        producerThread.start();
        consumerThread.start();
    }

}
