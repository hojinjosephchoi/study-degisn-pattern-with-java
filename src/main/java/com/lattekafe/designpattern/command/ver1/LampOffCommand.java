package com.lattekafe.designpattern.command.ver1;

public class LampOffCommand implements Command {
	
	private Lamp lamp;
	
	

	public LampOffCommand(Lamp lamp) {
		super();
		this.lamp = lamp;
	}



	@Override
	public void execute() {
		lamp.turnOff();

	}

}
