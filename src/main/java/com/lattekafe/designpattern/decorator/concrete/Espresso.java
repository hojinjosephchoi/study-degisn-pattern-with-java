package com.lattekafe.designpattern.decorator.concrete;

import com.lattekafe.designpattern.decorator.abst.AbstAdding;
import com.lattekafe.designpattern.decorator.abst.IBeverage;

public class Espresso extends AbstAdding {
	
	protected static int espressoCount = 0;
	
	public Espresso(IBeverage meterial) {
		super(meterial);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + getAddPrice();
	}
	
	private static int getAddPrice(){
		espressoCount += 1;
		int addPrice = 100;
		
		if(espressoCount > 1){
			addPrice = 70;
		}
		
		return addPrice;
	}

	

}
