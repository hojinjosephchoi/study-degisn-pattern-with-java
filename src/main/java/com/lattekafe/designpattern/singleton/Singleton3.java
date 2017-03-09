package com.lattekafe.designpattern.singleton;

public class Singleton3 {
	
	private static Singleton3 instance;
	private int count = 0;
	
	private Singleton3(){
		
	}
	
	public synchronized static Singleton3 getInstance(){
		if(instance == null){
			instance = new Singleton3();
		}
		return instance;
	}
	
	public void method(){
		synchronized (this) {
			count++;
			System.out.println(instance.toString() + " >> " + count);	
		}
	}

}
