package com.lattekafe.designpattern.decorator.ver2.concrete;

import com.lattekafe.designpattern.decorator.ver2.abst.CarComponent;
import com.lattekafe.designpattern.decorator.ver2.abst.CarOptionDecorator;

public class AirBagDecorator extends CarOptionDecorator {
	
	private int airBagPrice;

	public AirBagDecorator(CarComponent decoratedCar, int airBagPrice) {
		super(decoratedCar);
		this.airBagPrice = airBagPrice;
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getAirBagPrice();
	}

	@Override
	public String getCarinfo() {
		return super.getCarinfo() + "[AirBag]";
	}

	private int getAirBagPrice() {
		return airBagPrice;
	}
	
	

}
