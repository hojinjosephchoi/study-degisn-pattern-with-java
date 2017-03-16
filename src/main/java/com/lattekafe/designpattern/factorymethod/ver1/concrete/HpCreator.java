package com.lattekafe.designpattern.factorymethod.ver1.concrete;

import java.util.Date;

import com.lattekafe.designpattern.factorymethod.ver1.framework.Item;
import com.lattekafe.designpattern.factorymethod.ver1.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("DB에서 회복 물약의 정보를 가져옵니다.");

	}

	@Override
	protected void createItemLog() {
		System.out.println("회복 물약을 새로 생성했습니다. " + new Date());

	}

	@Override
	protected Item createItem() {

		return new HpPotion();
	}

}
