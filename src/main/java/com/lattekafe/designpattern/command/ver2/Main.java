package com.lattekafe.designpattern.command.ver2;

public class Main {

	public static void main(String[] args) {
		ElevatorController ctrl1 = new ElevatorController(1);
		ElevatorController ctrl2 = new ElevatorController(2);
		
		ElevatorManager em = new ElevatorManager(2);
		em.addController(ctrl1);
		em.addController(ctrl2);
		
		
		Command destCmd1stCtrl = new DestinationSelectionCommand(1, ctrl1);
		ElevatorButton destBtn1stFloor = new ElevatorButton(destCmd1stCtrl);
		destBtn1stFloor.pressed();
		
		Command destCmd2ndCtrl = new DestinationSelectionCommand(2, ctrl2);
		ElevatorButton destBtn2ndFloor = new ElevatorButton(destCmd2ndCtrl);
		destBtn2ndFloor.pressed();
		
		Command requestDownCommand = new ElevatorRequestCommand(em, 2, Direction.DOWN);
		ElevatorButton requestDownFloorBtn2ndFloor = new ElevatorButton(requestDownCommand);
		requestDownFloorBtn2ndFloor.pressed();

	}

}
