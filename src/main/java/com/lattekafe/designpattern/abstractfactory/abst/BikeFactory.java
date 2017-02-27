package com.lattekafe.designpattern.abstractfactory.abst;

public interface BikeFactory {
	
	public Body createBody();
	public Wheel createWheel();

}
