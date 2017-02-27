package com.lattekafe.designpattern.bridge;

public class Main {

	public static void main(String[] args) {
//		PrintMorseCode code = new PrintMorseCode(new DefaultMorseCodeFunction());
//		PrintMorseCode code = new PrintMorseCode(new SoundMorseCodeFunction());
		PrintMorseCode code = new PrintMorseCode(new FlashMorseCodeFunction());
		
		code.h().o().j().i().n();

	}

}
