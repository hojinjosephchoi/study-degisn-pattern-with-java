package com.lattekafe.designpattern.factorymethod.ver2;

public class LimpState extends CarState {
	
	private static LimpState instance = null;
	
	public static final int LIMP_MODE_MAX_SPEED = 60;
	
	
	private LimpState(Car car) {
		super(car);
	}

	public static LimpState getInstance(Car car){
		if(instance == null){
			instance = new LimpState(car);
		}
		return instance;
	}

	@Override
	public void speedUp(int targetSpeed) {
		System.out.print("Speed : " + car.getSpeed());
		
		if(targetSpeed > car.getSpeed() && targetSpeed < LIMP_MODE_MAX_SPEED){
			car.setSpeed(targetSpeed);
		}
		
		System.out.println(" => " + car.getSpeed());

	}

	@Override
	public void engineFailedDetected() {
		System.out.println("Unexpected Event");

	}

	@Override
	public void engineRepaired() {
		car.setState(CarStateID.NORMAL);

	}

}
