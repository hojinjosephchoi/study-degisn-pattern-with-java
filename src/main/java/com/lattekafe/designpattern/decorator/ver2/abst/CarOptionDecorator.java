package com.lattekafe.designpattern.decorator.ver2.abst;

public abstract class CarOptionDecorator extends CarComponent {
	
	private CarComponent decoratedCar;
	
	public CarOptionDecorator(CarComponent decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	@Override
	public int getPrice() {
		return decoratedCar.getPrice();
	}

	@Override
	public String getCarinfo() {
		return decoratedCar.getCarinfo();
	}
	
	
}
