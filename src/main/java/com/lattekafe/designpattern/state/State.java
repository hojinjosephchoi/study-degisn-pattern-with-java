package com.lattekafe.designpattern.state;

public interface State {
	public void pushOnButton(Light light);
	public void pushOffButton(Light light);
}
