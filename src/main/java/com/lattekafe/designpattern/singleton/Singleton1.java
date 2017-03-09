package com.lattekafe.designpattern.singleton;


public class Singleton1 {
	
	private static Singleton1 instance;
	private int count = 0;
	
	private Singleton1(){
		
	}
	
	public static Singleton1 getInstance(){
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
	
	public void method(){
		count++;
		System.out.println(instance.toString() + " >> " + count);
	}

}
