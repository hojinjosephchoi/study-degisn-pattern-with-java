package com.lattekafe.designpattern.observer.ver4;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = null;
	
	public Subject(){
		observers = new ArrayList<>();
	}
	
	public void attachObserver(Observer observer){
		this.observers.add(observer);
	}
	
	public void detachObserver(Observer observer){
		this.observers.remove(observer);
	}
	
	public void notifyObservers(){
		for(Observer observer : observers){
			observer.update(this);
		}
	}
}
