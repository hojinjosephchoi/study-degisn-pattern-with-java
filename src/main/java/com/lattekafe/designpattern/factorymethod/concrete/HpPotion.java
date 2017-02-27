package com.lattekafe.designpattern.factorymethod.concrete;

import com.lattekafe.designpattern.factorymethod.framework.Item;

public class HpPotion implements Item {

	@Override
	public void use() {
		System.out.println("체력 회복");

	}

}
