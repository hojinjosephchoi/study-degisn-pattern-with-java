package com.lattekafe.designpattern.decorator.concrete;

import com.lattekafe.designpattern.decorator.abst.AbstAdding;
import com.lattekafe.designpattern.decorator.abst.IBeverage;

public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + 50;
	}
	
	

}
