package com.lattekafe.designpattern.factorymethod;

import com.lattekafe.designpattern.factorymethod.concrete.HpCreator;
import com.lattekafe.designpattern.factorymethod.concrete.MpCreator;
import com.lattekafe.designpattern.factorymethod.framework.Item;
import com.lattekafe.designpattern.factorymethod.framework.ItemCreator;

public class Main {

	public static void main(String[] args) {

		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		
		
		creator = new MpCreator();
		item = creator.create();
		item.use();

	}

}
