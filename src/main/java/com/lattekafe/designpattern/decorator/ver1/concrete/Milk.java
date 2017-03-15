package com.lattekafe.designpattern.decorator.ver1.concrete;

import com.lattekafe.designpattern.decorator.ver1.abst.AbstAdding;
import com.lattekafe.designpattern.decorator.ver1.abst.IBeverage;

public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + 50;
	}
	
	

}
