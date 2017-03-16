package com.lattekafe.designpattern.factorymethod.ver2;

/**
 * Factory Method 패턴 적용 
 * (객체 생성을 전담하는 별도의 클래스를 두는 방식)
 */
public class CarStateFactory {
	
	private static CarStateFactory instance = null;
	
	private CarStateFactory(){}
	
	public static CarStateFactory getInstance(){
		if(instance == null){
			instance = new CarStateFactory();
		}
		return instance;
	}
	
	public CarState getState(CarStateID stateId, Car car){
		if(stateId == CarStateID.NORMAL){
			return NormalState.getInstance(car);
		}else if(stateId == CarStateID.LIMP){
			return LimpState.getInstance(car);
		}else{
			return null;
		}
		
	}

}
