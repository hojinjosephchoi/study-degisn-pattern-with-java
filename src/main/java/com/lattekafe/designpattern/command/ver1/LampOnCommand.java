package com.lattekafe.designpattern.command.ver1;

public class LampOnCommand implements Command {
	
	private Lamp lamp;
	
	

	public LampOnCommand(Lamp lamp) {
		super();
		this.lamp = lamp;
	}



	@Override
	public void execute() {
		lamp.turnOn();
	}

}
