package com.lattekafe.designpattern.state;

public class OffState implements State {
	
	private static OffState instance = null;
	
	private OffState(){}
	
	public synchronized static OffState getInstance(){
		if(instance == null){
			instance = new OffState();
		}
		return instance;
	}

	@Override
	public void pushOnButton(Light light) {
		System.out.println("Light On");
		light.setState(OnState.getInstance());

	}

	@Override
	public void pushOffButton(Light light) {
		System.out.println("반응 없음");

	}

}
