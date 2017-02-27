package com.lattekafe.designpattern.abstractfactory.ver1.samcheoli;

import com.lattekafe.designpattern.abstractfactory.ver1.abst.BikeFactory;
import com.lattekafe.designpattern.abstractfactory.ver1.abst.Body;
import com.lattekafe.designpattern.abstractfactory.ver1.abst.Wheel;

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
