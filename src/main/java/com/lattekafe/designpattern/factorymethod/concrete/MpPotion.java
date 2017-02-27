package com.lattekafe.designpattern.factorymethod.concrete;

import com.lattekafe.designpattern.factorymethod.framework.Item;

public class MpPotion implements Item {

	@Override
	public void use() {
		System.out.println("마력 회복");

	}

}
