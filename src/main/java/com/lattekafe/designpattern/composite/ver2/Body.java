package com.lattekafe.designpattern.composite.ver2;

public class Body extends ComputerDevice {
	
	private int price;
	private int power;
	
	

	public Body(int price, int power) {
		super();
		this.price = price;
		this.power = power;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int getPower() {
		return power;
	}

}
