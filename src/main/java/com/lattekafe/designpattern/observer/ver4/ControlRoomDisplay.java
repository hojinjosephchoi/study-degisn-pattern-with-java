package com.lattekafe.designpattern.observer.ver4;

public class ControlRoomDisplay implements Observer {

	@Override
	public void update(Object obj) {
		if(obj instanceof ElevatorController){
			System.out.println("[Control Room Display] >> " + ((ElevatorController)obj).getCurFloor());	
		}

	}

}
