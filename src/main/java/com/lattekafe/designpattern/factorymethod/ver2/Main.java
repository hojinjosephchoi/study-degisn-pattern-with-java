package com.lattekafe.designpattern.factorymethod.ver2;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.speedUp(150);
		car.speedDown(130);
		
		car.enginFailedDetected();
		
		car.speedUp(100);
		car.speedDown(30);
		
		car.speedUp(50);
		car.speedUp(100);
		
		car.engineRepaired();
		car.speedUp(100);

	}

}
