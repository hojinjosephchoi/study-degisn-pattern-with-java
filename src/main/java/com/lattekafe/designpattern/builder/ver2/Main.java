package com.lattekafe.designpattern.builder.ver2;

public class Main {

	public static void main(String[] args) {
		
		Computer computer = ComputerBuilder
				.start()
				.setCpu("i7")
				.setRam("8g")
				.setStorage("256GB ssd")
				.build();
		
		System.out.println(computer.toString());

	}

}
