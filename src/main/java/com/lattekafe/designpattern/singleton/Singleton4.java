package com.lattekafe.designpattern.singleton;


public class Singleton4 {
	
	private static int count = 0;
	public synchronized static void method(){
		count++;
		System.out.println(Singleton4.class.getName() + " >> " + count);
	}

}
