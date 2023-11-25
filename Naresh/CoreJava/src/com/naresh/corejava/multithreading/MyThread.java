package com.naresh.corejava.multithreading;

public class MyThread extends Thread {
	
	public void run() {
		String result = Thread.currentThread().getName().equals("naresh1") ? naresh1Task() : naresh2Task();
		
		
	}
	
	private String naresh1Task() {
		for(int i = 1001; i<=2000; i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
		}
		return "Success";
	}
	
	private String naresh2Task() {
		for(int i = 2001; i<=3000; i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
		}
		return "Success";
	}

}
