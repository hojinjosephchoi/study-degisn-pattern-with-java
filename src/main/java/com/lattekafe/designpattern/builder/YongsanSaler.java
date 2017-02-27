package com.lattekafe.designpattern.builder;

public class YongsanSaler {
	
	private Blueprint blueprint;
	
	public void setBlueprint(Blueprint blueprint){
		this.blueprint = blueprint;
	}
	
	
	public void constructComputer(){
		blueprint.createNewComputer();
		blueprint.setCpu();
		blueprint.setRam();
		blueprint.setStorage();
		
	}
	
	public Computer getComputer(){
		return blueprint.getComputer();
	}

}
