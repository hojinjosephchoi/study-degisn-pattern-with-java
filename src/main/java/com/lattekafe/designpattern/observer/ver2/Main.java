package com.lattekafe.designpattern.observer.ver2;

import java.util.Observable;
import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.addObserver(new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				System.out.println(o + "is clicked.");
				
			}
		});
		
		btn.click();
		btn.click();
		btn.click();
		
	}

}
