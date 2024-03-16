package com.battleships.app.UnaAPPSocket.threadExercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ClassThreadRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();
	}
	
	public void go() {
		doMore();
	}
	
	public void doMore() {
		System.out.println(Thread.currentThread().getName());
		
		Thread.dumpStack();
	}
	
	public static void main(String[] args) {
		ClassThreadRunnable c = new ClassThreadRunnable();

		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		executor.execute(c);
		
		
		System.out.println(Thread.currentThread().getName() + ": back in main");
		
		Thread.dumpStack();
		
		executor.shutdown();
		
		
	}
	
}
