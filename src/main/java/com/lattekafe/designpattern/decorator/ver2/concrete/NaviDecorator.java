package com.lattekafe.designpattern.decorator.ver2.concrete;

import com.lattekafe.designpattern.decorator.ver2.abst.CarComponent;
import com.lattekafe.designpattern.decorator.ver2.abst.CarOptionDecorator;

public class NaviDecorator extends CarOptionDecorator {
	
	private int naviPrice;

	public NaviDecorator(CarComponent decoratedCar, int naviPrice) {
		super(decoratedCar);
		this.naviPrice = naviPrice;
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getNaviPrice();
	}

	@Override
	public String getCarinfo() {
		return super.getCarinfo() + "[Navigator]";
	}

	private int getNaviPrice() {
		return naviPrice;
	}
	
	

}
