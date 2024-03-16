package com.battleships.app.UnaAPPSocket.threadExercise;

public class TestClassThreadRunnable {
	public static void main(String[] args) {
		ClassThreadRunnable c = new ClassThreadRunnable();
		Thread mythread = new Thread(c);
		
		mythread.start();
		
		System.out.println(Thread.currentThread().getName() + ": back in main");
		
		Thread.dumpStack();
	}
}
