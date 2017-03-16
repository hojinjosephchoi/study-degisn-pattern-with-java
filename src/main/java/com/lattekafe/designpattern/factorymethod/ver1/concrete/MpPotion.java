package com.lattekafe.designpattern.factorymethod.ver1.concrete;

import com.lattekafe.designpattern.factorymethod.ver1.framework.Item;

public class MpPotion implements Item {

	@Override
	public void use() {
		System.out.println("마력 회복");

	}

}
