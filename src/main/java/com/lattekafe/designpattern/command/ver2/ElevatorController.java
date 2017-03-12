package com.lattekafe.designpattern.command.ver2;

/**
 * Receiver
 * 하나의 엘레베이터를 제어하고 이동 
 */
public class ElevatorController {
	
	private int id;
	private int curFloor;
	
	public ElevatorController(int id){
		this.id = id;
		curFloor = 1;
	}
	
	public void gotoFloor(int destination){
		System.out.println("Elevator ID >> " + this.id + 
				", currentFloor >> " + this.curFloor + 
				", Destination >> " + destination);
		
		curFloor = destination;
		
	}

	public int getCurFloor() {
		return curFloor;
	}

}
