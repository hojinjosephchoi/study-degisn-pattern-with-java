package com.lattekafe.designpattern.factorymethod.ver2;

public class NormalState extends CarState {
	
	private static NormalState instance = null;

	private NormalState(Car car) {
		super(car);
	}
	
	public static NormalState getInstance(Car car){
		if(instance == null){
			instance = new NormalState(car);
		}
		return instance;
	}

	@Override
	public void speedUp(int targetSpeed) {
		System.out.print("Speed : " + car.getSpeed());
		
		if(targetSpeed > car.getSpeed()){
			car.setSpeed(targetSpeed);
		}
		
		System.out.println(" => " + car.getSpeed());

	}

	@Override
	public void engineFailedDetected() {
		System.out.print("Speed : " + car.getSpeed());
		car.setSpeed(LimpState.LIMP_MODE_MAX_SPEED);
		System.out.println(" => " + car.getSpeed());
		
		car.setState(CarStateID.LIMP);
	}

	@Override
	public void engineRepaired() {
		System.out.println("Unexpected Event");

	}

}
