package com.lattekafe.designpattern.builder;

public class Main {

	public static void main(String[] args) {
		
		YongsanSaler yongpary = new YongsanSaler();
//		yongpary.setBlueprint(new LgGramBlueprint());
		yongpary.setBlueprint(new MacBlueprint());
		yongpary.constructComputer();
		Computer computer = yongpary.getComputer();

		System.out.println(computer.toString());

	}

}
