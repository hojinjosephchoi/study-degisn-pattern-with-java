package com.lattekafe.designpattern.builder;

public abstract class Blueprint {
	
	protected Computer computer;
	
	public abstract void setCpu();
	public abstract void setRam();
	public abstract void setStorage();
	
	public void createNewComputer(){
		computer = new Computer("default", "default", "default");
	}
	
	public Computer getComputer(){
		return computer;
	}

}
