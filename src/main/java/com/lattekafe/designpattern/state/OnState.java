package com.lattekafe.designpattern.state;

public class OnState implements State {
	
	private static OnState instance = null;
	
	private OnState(){}
	
	public synchronized static OnState getInstance(){
		if(instance == null){
			instance = new OnState();
		}
		return instance;
	}

	@Override
	public void pushOnButton(Light light) {
		System.out.println("반응 없음");

	}

	@Override
	public void pushOffButton(Light light) {
		System.out.println("Light Off");
		light.setState(OffState.getInstance());

	}

}
