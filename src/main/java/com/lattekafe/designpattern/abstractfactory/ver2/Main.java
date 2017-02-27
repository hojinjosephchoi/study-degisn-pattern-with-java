package com.lattekafe.designpattern.abstractfactory.ver2;

import com.lattekafe.designpattern.abstractfactory.ver2.abst.Button;
import com.lattekafe.designpattern.abstractfactory.ver2.abst.GuiFac;
import com.lattekafe.designpattern.abstractfactory.ver2.abst.TextArea;
import com.lattekafe.designpattern.abstractfactory.ver2.concrete.FactoryInstance;

public class Main {

	public static void main(String[] args) throws Exception {
		
		GuiFac fac = FactoryInstance.getGuiFac();
		
		Button btn = fac.createButton();
		TextArea txtArea = fac.createTextArea();
		
		btn.click();
		System.out.println(txtArea.getText());

	}

}
