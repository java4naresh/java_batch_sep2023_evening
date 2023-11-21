package com.naresh.corejava.multithreading;

public class MyThread extends Thread {
	
	public void run() {
		if(Thread.currentThread().getName().equals("naresh1")) {
		for(int i = 1001; i<=2000; i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
		}
		} else {
			for(int i = 2001; i<=3000; i++) {
				System.out.println(i+" "+ Thread.currentThread().getName());
			}
		}
	}

}
