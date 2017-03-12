package com.lattekafe.designpattern.command.ver2;

import java.util.ArrayList;
import java.util.List;

/**
 * Receiver
 * 복수개의 엘레베이터를 관리 
 */
public class ElevatorManager {

	private List<ElevatorController> controllers;
	
	public ElevatorManager(int controllerCount){
		controllers = new ArrayList<>(controllerCount);
	}
	
	public void addController(ElevatorController controller){
		controllers.add(controller);
	}
	
	public void requestElevator(int destination, Direction direction){
		int selectedElInx = selectElevator(destination, direction);
		controllers.get(selectedElInx).gotoFloor(destination);
		
	}
	
	/**
	 * 목적지 층과 요청 방향에 따라 엘레베이터를 선택함 
	 * @param destination 목적지 층 
	 * @param direction 방향 
	 * @return 엘레베이터 index
	 */
	private int selectElevator(int destination, Direction direction){
		int minimumGap = Math.abs(controllers.get(0).getCurFloor() - destination);
		int currentSelectedControllerInx = 0;
		for(int inx = 0; inx < controllers.size(); inx++){
			ElevatorController ctrler = controllers.get(inx);
			int tmpGap = Math.abs(ctrler.getCurFloor() - destination);
			
			if(tmpGap < minimumGap){
				minimumGap = tmpGap;
				currentSelectedControllerInx = inx;
			}
		}
		
		return currentSelectedControllerInx;
	}
	
	
}
