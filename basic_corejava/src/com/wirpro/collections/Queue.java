package com.wirpro.collections;

import java.util.LinkedList;

public class Queue<T> {
	private LinkedList<T> list = new LinkedList<>();
	
	public void enqueue(T item) {
		list.addLast(item);
	}

	public T dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException("Queue is Empty");
		}
		return list.removeFirst();
	}

	private boolean isEmpty() {	
		return list.isEmpty();
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Queue is Empty");
		}
		return list.getFirst();
	}
	
	public int size() {
		return list.size();
	}
	
	public void printQueue() {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		Queue<Integer> que = new Queue<Integer>();
		
		que.enqueue(10); que.enqueue(20); que.enqueue(30);
		que.enqueue(40); que.enqueue(50); que.enqueue(30);
		
		que.printQueue();
		
		System.out.println("Dequeue: " + que.dequeue());
		que.printQueue();
		
		System.out.println("peek: " + que.peek());
	}
}
