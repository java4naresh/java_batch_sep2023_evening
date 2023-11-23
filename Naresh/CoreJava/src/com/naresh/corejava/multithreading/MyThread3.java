package com.naresh.corejava.multithreading;

public class MyThread3 extends Thread {
	
	Task task;
	
	public MyThread3(Task task) {
		this.task = task;
	}
	
	public void run() {
		task.doTask();
	}
	

}
