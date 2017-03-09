package com.lattekafe.designpattern.singleton;

public class Main {

	public static void main(String[] args) {

//		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
//		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
//		
//		System.out.println(speaker1.getVolume());
//		System.out.println(speaker2.getVolume());
//		
//		speaker1.setVolume(11);
//		
//		System.out.println(speaker1.getVolume());
//		System.out.println(speaker2.getVolume());
//		
//		speaker2.setVolume(22);
//		
//		System.out.println(speaker1.getVolume());
//		System.out.println(speaker2.getVolume());
		
		for(int inx = 0; inx < 5; inx++){
			new Thread(() -> {
				Singleton4.method();
			}).start();;	
		}
		

	}

}
