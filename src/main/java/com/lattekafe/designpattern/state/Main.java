package com.lattekafe.designpattern.state;

public class Main {

	public static void main(String[] args) {
		
		Light light = new Light();
		light.pushOffButton();
		light.pushOnButton();
		light.pushOffButton();

	}

}
