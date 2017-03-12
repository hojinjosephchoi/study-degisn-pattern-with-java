package com.lattekafe.designpattern.command.ver2;

/**
 * Concrete Command
 * 건물의 각 층에서 버튼을 눌렀을 때 여러 엘레베이터 중 적절한 엘레베이터를 해당 층으로 이동 
 *
 */
public class ElevatorRequestCommand implements Command {

	private ElevatorManager em;
	private int destination;
	private Direction direction;
	
	
	/**
	 * 
	 * @param em 엘레베이터 매니저 (적당한 엘레베이터를 지정해서 보내주는 역할) 
	 * @param destination 건물 내 층 
	 * @param direction 방향 (여기에서는 구현 안함)
	 */
	public ElevatorRequestCommand(ElevatorManager em, int destination, Direction direction) {
		this.em = em;
		this.destination = destination;
		this.direction = direction;
	}


	/**
	 * 엘레베이터 호출 
	 */
	@Override
	public void execute() {
		em.requestElevator(destination, direction);
	}

}
