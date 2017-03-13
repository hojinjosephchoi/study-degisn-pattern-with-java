package com.lattekafe.designpattern.observer.ver4;

public class ElevatorController extends Subject {

	private int curFloor = 1;
	
	public void gotoFloor(int destination){
		curFloor = destination;
		this.notifyObservers();
	}

	public int getCurFloor() {
		return curFloor;
	}
	
	
}
