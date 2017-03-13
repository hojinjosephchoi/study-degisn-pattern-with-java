package com.lattekafe.designpattern.observer.ver4;

public class FloorDisplay implements Observer {

	@Override
	public void update(Object obj) {
		if(obj instanceof ElevatorController){
			System.out.println("[Floor Display] >> " + ((ElevatorController)obj).getCurFloor());	
		}

	}

}
