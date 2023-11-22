package com.naresh.corejava.multithreading;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getPriority());
		
		for(int i = 1001; i<=2000; i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
		}
	}

}
