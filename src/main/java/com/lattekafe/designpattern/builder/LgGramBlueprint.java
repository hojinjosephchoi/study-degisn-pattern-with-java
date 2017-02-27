package com.lattekafe.designpattern.builder;

public class LgGramBlueprint extends Blueprint {

	@Override
	public void setCpu() {
		computer.setCpu("i7");

	}

	@Override
	public void setRam() {
		computer.setRam("8g");

	}

	@Override
	public void setStorage() {
		computer.setStorage("256 GB SSD");

	}


}
