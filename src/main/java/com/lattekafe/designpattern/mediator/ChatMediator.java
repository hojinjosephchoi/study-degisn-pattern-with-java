package com.lattekafe.designpattern.mediator;

import com.lattekafe.designpattern.mediator.contract.Colleague;
import com.lattekafe.designpattern.mediator.contract.Mediator;

public class ChatMediator extends Mediator {

	@Override
	public void mediate(String data) {
		for(Colleague colleague : colleagues){
			//중재 가능성
			colleague.handle(data);
		}

	}

}
