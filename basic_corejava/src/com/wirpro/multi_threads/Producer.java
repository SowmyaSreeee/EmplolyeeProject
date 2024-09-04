package com.wirpro.multi_threads;

public class Producer implements Runnable{
	private final Operations buffer;

	public Producer(Operations buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				//Producer: This is a thread or process that generates data, puts it into a buffer (or queue),
				//and then continues its task.
				buffer.produce(i); //
				Thread.sleep(100); // Simulate time taken to produce an item
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
