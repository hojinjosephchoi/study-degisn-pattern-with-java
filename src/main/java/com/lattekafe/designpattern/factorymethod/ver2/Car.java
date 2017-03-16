package com.lattekafe.designpattern.factorymethod.ver2;

public class Car {
	private int speed;
	private CarState state;
	
	public Car() {
		setState(CarStateID.NORMAL);
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setState(CarStateID stateId) {
		state = CarStateFactory.getInstance().getState(stateId, this);
	}
	
	public void speedDown(int targetSpeed){
		state.speedDown(targetSpeed);
	}
	public void speedUp(int targetSpeed){
		state.speedUp(targetSpeed);
	}
	public void enginFailedDetected(){
		state.engineFailedDetected();
	}
	public void engineRepaired(){
		state.engineRepaired();
	}
	
	
}
