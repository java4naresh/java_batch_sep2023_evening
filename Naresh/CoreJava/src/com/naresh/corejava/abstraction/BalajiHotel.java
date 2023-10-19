package com.naresh.corejava.abstraction;

public class BalajiHotel implements Hotel {

	@Override
	public void idly() {
		System.out.println("40% urad dal");
		System.out.println("60% idly ravva");
		System.out.println("apply stream");
		System.out.println("idly ready");
	}

	@Override
	public void puri() {
		System.out.println("70% Wheat flour");
		System.out.println("10% maida flour");
		System.out.println("15% salt water");
		System.out.println("5% oil");
		System.out.println("apply stream");
		System.out.println("puri ready");
		
	}

	@Override
	public void dosa() {
		System.out.println("30% urad dal");
		System.out.println("68% rice flour");
		System.out.println("2% ghee");
		System.out.println("apply stream");
		System.out.println("dosa ready");
		
	}

}
