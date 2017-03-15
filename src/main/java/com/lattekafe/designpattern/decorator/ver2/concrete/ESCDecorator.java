package com.lattekafe.designpattern.decorator.ver2.concrete;

import com.lattekafe.designpattern.decorator.ver2.abst.CarComponent;
import com.lattekafe.designpattern.decorator.ver2.abst.CarOptionDecorator;

public class ESCDecorator extends CarOptionDecorator {
	
	private int escPrice;

	public ESCDecorator(CarComponent decoratedCar, int escPrice) {
		super(decoratedCar);
		this.escPrice = escPrice;
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getEscPrice();
	}

	@Override
	public String getCarinfo() {
		return super.getCarinfo() + "[ESC]";
	}

	private int getEscPrice() {
		return escPrice;
	}
	
	
}
