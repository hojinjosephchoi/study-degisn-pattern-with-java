package com.lattekafe.designpattern.factorymethod.ver1;

import com.lattekafe.designpattern.factorymethod.ver1.concrete.HpCreator;
import com.lattekafe.designpattern.factorymethod.ver1.concrete.MpCreator;
import com.lattekafe.designpattern.factorymethod.ver1.framework.Item;
import com.lattekafe.designpattern.factorymethod.ver1.framework.ItemCreator;

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
