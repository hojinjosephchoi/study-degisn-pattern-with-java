package com.lattekafe.designpattern.bridge;

public class PrintMorseCode extends MorseCode {

	public PrintMorseCode(MorseCodeFunction func) {
		super(func);
	}

	public PrintMorseCode h(){
		dot();dot();dot();dot();space();
		return this;
	}
	
	public PrintMorseCode o(){
		dash();dash();dash();space();
		return this;
	}
	
	public PrintMorseCode j(){
		dot();dash();dash();dash();space();
		return this;
	}
	
	public PrintMorseCode i(){
		dot();dot();space();
		return this;
	}
	
	public PrintMorseCode n(){
		dash();dot();space();
		return this;
	}
}
