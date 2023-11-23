package com.naresh.corejava.multithreading;

public class MyThread4 extends Thread {
	
	public void run() {
		for(int i=1;i<=500;i++) {
			System.out.println(i + " "+ Thread.currentThread().getName());
		}
	}

}
