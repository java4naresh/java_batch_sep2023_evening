package com.naresh.corejava.multithreading;

public class WaitAndNotifyClient {

	public static void main(String[] args) throws InterruptedException {
		MyThread5 t = new MyThread5();
		t.start();
		synchronized(t) {
		t.wait();
		System.out.println(t.getCount());
		}

	}

}
