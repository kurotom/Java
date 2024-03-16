package com.battleships.app.UnaAPPSocket.threadExercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PoolThreadsClass {
	
	public static ExecutorService threads;

	public static void main(String[] args) {
//		ExecutorService threads = Executors.newFixedThreadPool(2);
		threads = Executors.newFixedThreadPool(2);
		threads.execute(() -> runJob("Job 1"));
		threads.execute(() -> runJob("Job 2"));
		threads.shutdown();
		try {
			threads.awaitTermination(1, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void runJob(String job) {
		for (int i = 0; i < 25; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(job + " is running on " + threadName);
		}
		threads.shutdownNow();
		
	}
}
