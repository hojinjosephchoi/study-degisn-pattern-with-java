package com.lattekafe.designpattern.command.ver1;

public class Main {

	public static void main(String[] args) {
		
		Lamp lamp = new Lamp();
		Command lampOnCmd = new LampOnCommand(lamp);
		Command lampOffCmd = new LampOffCommand(lamp);
		
		Button btn = new Button(lampOnCmd);
		btn.pressed();
		
		
		btn.setCommand(lampOffCmd);
		btn.pressed();

	}

}
