package com.lattekafe.designpattern.composite.ver2;

public class Main {

	public static void main(String[] args) {
		Body body = new Body(100, 70);
		Keyboard keyboard = new Keyboard(5, 2);
		Monitor monitor = new Monitor(20, 30);
		Speaker speaker = new Speaker(10, 20);
		
		Computer computer = new Computer();
		computer.addComponent(body);
		computer.addComponent(keyboard);
		computer.addComponent(monitor);
		computer.addComponent(speaker);
		
		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();
		System.out.println("Computer Price : " + computerPrice + "원");
		System.out.println("Computer Power : " + computerPower + "W");

	}

}
