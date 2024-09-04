package com.wirpro.multi_threads;

import java.util.LinkedList;
import java.util.Queue;

public class Operations {
	private final Queue<Integer> buffer = new LinkedList<>();
	private final int capacity;
	
	public Operations(int capacity) {
		this.capacity = capacity;
	}
	
	public synchronized void produce(int item) throws InterruptedException {
		while(buffer.size() == capacity) {
			wait();
		}
		buffer.add(item);
		System.out.println("Produced: " + item);
		notify();
	}
	
	public synchronized int consume() throws InterruptedException {
		while(buffer.isEmpty()) {
			wait();
		}
		int item = buffer.poll();
		System.out.println("Consumed " + item);
		notify();
		return item;
	}

}
