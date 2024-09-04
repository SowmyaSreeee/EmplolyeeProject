package com.wirpro.multi_threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		List<Future<Integer>> futures = new ArrayList<>();
		
		for(int i = 0 ; i < 10 ; i++) {
			final int taskId = i;
			Callable<Integer> task = () -> {
				Thread.sleep(2000);
				return taskId * 2;
			};
			futures.add(executor.submit(task));
		}
		
		for(Future<Integer> f : futures) {
			try {
				System.out.println("Task Results: " + f.get());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();
	}
}
