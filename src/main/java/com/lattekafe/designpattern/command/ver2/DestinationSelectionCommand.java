package com.lattekafe.designpattern.command.ver2;

/**
 * Concrete Command
 * 엘레베이터 내부에서 버튼 눌렀을 때 해당 엘레베이터를 지정된 층으로 이동 
 *
 */
public class DestinationSelectionCommand implements Command {
	
	private int destination;
	private ElevatorController controller;
	
	
	/**
	 * 
	 * @param destination 목적 층 
	 * @param controller 제어대상 엘레베이터 
	 */
	public DestinationSelectionCommand(int destination, ElevatorController controller) {
		super();
		this.destination = destination;
		this.controller = controller;
	}



	/**
	 * 지정된 층으로 엘레베이터 이동 
	 */
	@Override
	public void execute() {
		controller.gotoFloor(destination);

	}

}
