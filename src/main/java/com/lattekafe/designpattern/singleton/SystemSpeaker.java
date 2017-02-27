package com.lattekafe.designpattern.singleton;

public class SystemSpeaker {
	
	private static SystemSpeaker instance;
	private int volume;
	
	// 외부에서 생성하지 못하도록 private 접근제한자 사용
	private SystemSpeaker(){
		volume = 5;
	}
	
	public static SystemSpeaker getInstance(){
		if(instance == null){
			// 시스템 스피커
			instance = new SystemSpeaker();
			System.out.println("신규 생성");
		}else{
			System.out.println("기 생성");
		}
		
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	

}
