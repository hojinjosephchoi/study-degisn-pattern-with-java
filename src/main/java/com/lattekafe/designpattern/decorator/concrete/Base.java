package com.lattekafe.designpattern.decorator.concrete;

import com.lattekafe.designpattern.decorator.abst.IBeverage;

public class Base implements IBeverage {

	@Override
	public int getTotalPrice() {
		return 0;
	}

}
