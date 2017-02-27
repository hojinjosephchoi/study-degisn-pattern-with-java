package com.lattekafe.designpattern.abstractfactory.samcheoli;

import com.lattekafe.designpattern.abstractfactory.abst.BikeFactory;
import com.lattekafe.designpattern.abstractfactory.abst.Body;
import com.lattekafe.designpattern.abstractfactory.abst.Wheel;

public class SamcheoliFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new SamcheoliBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamcheoliWheel();
	}

}
