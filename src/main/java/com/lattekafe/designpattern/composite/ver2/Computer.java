package com.lattekafe.designpattern.composite.ver2;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice {
	
	private List<ComputerDevice> components;
	
	
	
	public Computer() {
		components = new ArrayList<>();
	}

	public void addComponent(ComputerDevice component){
		components.add(component);
	}
	
	public void removeComponent(ComputerDevice component){
		components.remove(component);
	}

	@Override
	public int getPrice() {
		int totalPrice = 0;
		for(ComputerDevice component : components){
			totalPrice += component.getPrice();
		}
		return totalPrice;
	}

	@Override
	public int getPower() {
		int totalPower = 0;
		for(ComputerDevice component : components){
			totalPower += component.getPower();
		}
		return totalPower;
	}

}
