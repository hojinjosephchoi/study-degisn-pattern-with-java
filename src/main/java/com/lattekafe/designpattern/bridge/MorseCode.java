package com.lattekafe.designpattern.bridge;

public class MorseCode {
	
	private MorseCodeFunction func;

	public MorseCode(MorseCodeFunction func) {
		this.func = func;
	}

	public void dot(){
		// delegate (위임)
		func.dot();
		
	}
	
	public void dash(){
		// delegate (위임)
		func.dash();
		
	}
	
	public void space(){
		// delegate (위임)
		func.space();
		
	}
	
}
