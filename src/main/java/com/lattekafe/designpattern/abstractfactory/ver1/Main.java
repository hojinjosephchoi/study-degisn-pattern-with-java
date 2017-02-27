package com.lattekafe.designpattern.abstractfactory.ver1;

import com.lattekafe.designpattern.abstractfactory.ver1.abst.BikeFactory;
import com.lattekafe.designpattern.abstractfactory.ver1.abst.Body;
import com.lattekafe.designpattern.abstractfactory.ver1.abst.Wheel;
import com.lattekafe.designpattern.abstractfactory.ver1.gt.GtFactory;
import com.lattekafe.designpattern.abstractfactory.ver1.samcheoli.SamcheoliFactory;

public class Main {

	public static void main(String[] args) {
//		BikeFactory factory = new SamcheoliFactory();
		BikeFactory factory = new GtFactory();
		
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());

	}

}
