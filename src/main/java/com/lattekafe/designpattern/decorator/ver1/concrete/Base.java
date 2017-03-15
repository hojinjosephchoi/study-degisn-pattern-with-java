package com.lattekafe.designpattern.decorator.ver1.concrete;

import com.lattekafe.designpattern.decorator.ver1.abst.IBeverage;

public class Base implements IBeverage {

	@Override
	public int getTotalPrice() {
		return 0;
	}

}
