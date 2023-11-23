package com.naresh.corejava.multithreading;

public class MyThread5 extends Thread {
	
	private int count;
	
	public synchronized void run() {
		for(int i=1; i<=250; i++) {
			count++;
		}
		this.notifyAll();
	}
	
	public int getCount() {
		return count;
	}
	
	

}
