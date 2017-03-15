package com.lattekafe.designpattern.decorator.ver1.abst;

public abstract class AbstAdding implements IBeverage {
	
	private IBeverage base;

	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}

	public IBeverage getBase() {
		return base;
	}

	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}
	
	

}
