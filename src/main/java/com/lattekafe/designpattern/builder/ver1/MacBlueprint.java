package com.lattekafe.designpattern.builder.ver1;

public class MacBlueprint extends Blueprint {

	@Override
	public void setCpu() {
		computer.setCpu("xeon");

	}

	@Override
	public void setRam() {
		computer.setRam("16g");

	}

	@Override
	public void setStorage() {
		computer.setStorage("1 TB SSD");

	}


}
