package com.lattekafe.designpattern.mediator;

import com.lattekafe.designpattern.mediator.contract.Colleague;

public class ChatColleague extends Colleague {

	@Override
	public void handle(String data) {
		System.err.println(this + "-" + data);

	}

}
