package com.lattekafe.designpattern.mediator;

import com.lattekafe.designpattern.mediator.contract.Colleague;
import com.lattekafe.designpattern.mediator.contract.Mediator;

public class Main {

	public static void main(String[] args) {

		Mediator mediator = new ChatMediator();
		
		Colleague colleague1 = new ChatColleague();
		Colleague colleague2 = new ChatColleague();
		Colleague colleague3 = new ChatColleague();
		
		colleague1.registerMediator(mediator);
		colleague2.registerMediator(mediator);
		colleague3.registerMediator(mediator);
				
		colleague1.sendData("AAA");
		colleague2.sendData("BBB");
		colleague3.sendData("CCC");

	}

}
