package com.naresh.corejava.multithreading;

public class MyThread6 extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public void start() {
		System.out.println(Thread.currentThread().getName());
	}

}
