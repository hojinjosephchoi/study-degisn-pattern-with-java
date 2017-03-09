package com.lattekafe.designpattern.singleton;

public class Singleton2 {
	
	private static Singleton2 instance = new Singleton2();
	private int count = 0;
	
	private Singleton2(){
		
	}
	
	public static Singleton2 getInstance(){
		return instance;
	}
	
	public synchronized void method(){
		count++;
		System.out.println(instance.toString() + " >> " + count);
	}

}
