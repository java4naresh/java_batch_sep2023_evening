package com.naresh.corejava.abstraction;

public class AnnapurnaHotel implements Hotel {

	@Override
	public void idly() {
		System.out.println("30% urad dal");
		System.out.println("70% idly ravva");
		System.out.println("apply stream");
		System.out.println("idly ready");
	}

	@Override
	public void puri() {
		System.out.println("80% Wheat flour");
		System.out.println("15% salt water");
		System.out.println("5% oil");
		System.out.println("apply stream");
		System.out.println("puri ready");
		
	}

	@Override
	public void dosa() {
		System.out.println("30% urad dal");
		System.out.println("70% rice flour");
		System.out.println("apply stream");
		System.out.println("dosa ready");
	
	}

}
