package com.lattekafe.designpattern.state;

public class Light {
	
	private State state = null;
	
	public Light() {
		state = OffState.getInstance();
	}
	
	public void pushOnButton(){
		state.pushOnButton(this);
	}
	
	public void pushOffButton(){
		state.pushOffButton(this);
	}

	public void setState(State state) {
		this.state = state;
	}

}
