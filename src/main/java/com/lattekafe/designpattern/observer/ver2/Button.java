package com.lattekafe.designpattern.observer.ver2;

import java.util.Observable;

public class Button extends Observable {
	
	public void click(){
		setChanged();
		notifyObservers();
	}
	
}
