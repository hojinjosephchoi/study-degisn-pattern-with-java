package com.lattekafe.designpattern.abstractfactory.gt;

import com.lattekafe.designpattern.abstractfactory.abst.BikeFactory;
import com.lattekafe.designpattern.abstractfactory.abst.Body;
import com.lattekafe.designpattern.abstractfactory.abst.Wheel;

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
