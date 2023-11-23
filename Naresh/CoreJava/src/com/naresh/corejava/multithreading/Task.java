package com.naresh.corejava.multithreading;

public class Task {
	
	public synchronized void doTask() {
		for(int i=1;i<=500;i++) {
			System.out.println(i + " "+ Thread.currentThread().getName());
		}
	}

}
