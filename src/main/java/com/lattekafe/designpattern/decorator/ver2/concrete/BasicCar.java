package com.lattekafe.designpattern.decorator.ver2.concrete;

import com.lattekafe.designpattern.decorator.ver2.abst.CarComponent;

public class BasicCar extends CarComponent {
	
	private int price;

	public BasicCar(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getCarinfo() {
		return "[Basic Car]";
	}

}
