package com.lattekafe.designpattern.decorator.ver2.concrete;

import com.lattekafe.designpattern.decorator.ver2.abst.CarComponent;
import com.lattekafe.designpattern.decorator.ver2.abst.CarOptionDecorator;

public class SCCDecorator extends CarOptionDecorator {
	
	private int sccPrice;

	public SCCDecorator(CarComponent decoratedCar, int sccPrice) {
		super(decoratedCar);
		this.sccPrice = sccPrice;
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getSccPrice();
	}

	@Override
	public String getCarinfo() {
		return super.getCarinfo() + "[SCC]";
	}

	private int getSccPrice() {
		return sccPrice;
	}
	
	

}
