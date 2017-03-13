package com.lattekafe.designpattern.observer.ver4;

public class ElevatorDisplay implements Observer {

	@Override
	public void update(Object obj) {
		if(obj instanceof ElevatorController){
			System.out.println("[Inside Elevator] >> " + ((ElevatorController)obj).getCurFloor());	
		}

	}

}
