package com.lattekafe.designpattern.observer.ver4;

public class VoiceNotice implements Observer {

	@Override
	public void update(Object obj) {
		if(obj instanceof ElevatorController){
			System.out.println("[Voice Notice] >> " + ((ElevatorController)obj).getCurFloor());	
		}

	}

}
