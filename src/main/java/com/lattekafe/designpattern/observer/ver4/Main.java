package com.lattekafe.designpattern.observer.ver4;

public class Main {

	public static void main(String[] args) {
		
		ElevatorController el = new ElevatorController();
		el.attachObserver(new ElevatorDisplay());
		el.attachObserver(new VoiceNotice());
		el.attachObserver(new FloorDisplay());
		el.attachObserver(new ControlRoomDisplay());
		
		el.gotoFloor(5);
		el.gotoFloor(10);

	}

}
