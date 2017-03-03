package com.lattekafe.designpattern.observer.ver3;

import com.lattekafe.designpattern.observer.ver3.Observable.Observer;

public class Button {
	private Observable<String> observable;
	
	
	public Button() {
		observable = new Observable<>();
	}

	public void addObserver(Observer<String> obs){
		observable.addObserver(obs);
	}
	
	public void notifyObservers(){

		observable.notifyObservers();
	}
	
	public void click(){
		observable.setChanged();
		notifyObservers();
	}
	
}
