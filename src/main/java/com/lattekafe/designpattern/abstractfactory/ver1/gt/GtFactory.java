package com.lattekafe.designpattern.abstractfactory.ver1.gt;

import com.lattekafe.designpattern.abstractfactory.ver1.abst.BikeFactory;
import com.lattekafe.designpattern.abstractfactory.ver1.abst.Body;
import com.lattekafe.designpattern.abstractfactory.ver1.abst.Wheel;

public class GtFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}

}
