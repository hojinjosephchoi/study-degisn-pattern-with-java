package com.lattekafe.designpattern.factorymethod.ver1.concrete;

import com.lattekafe.designpattern.factorymethod.ver1.framework.Item;

public class HpPotion implements Item {

	@Override
	public void use() {
		System.out.println("체력 회복");

	}

}
