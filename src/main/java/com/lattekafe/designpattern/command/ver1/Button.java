package com.lattekafe.designpattern.command.ver1;

public class Button {
	
	private Command command;
	
	public Button(Command command){
		this.command = command;
	}
	
	public void pressed(){
		command.execute();
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	

}
