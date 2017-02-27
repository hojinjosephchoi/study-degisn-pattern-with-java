package com.lattekafe.designpattern.abstractfactory;

import com.lattekafe.designpattern.abstractfactory.abst.BikeFactory;
import com.lattekafe.designpattern.abstractfactory.abst.Body;
import com.lattekafe.designpattern.abstractfactory.abst.Wheel;
import com.lattekafe.designpattern.abstractfactory.gt.GtFactory;
import com.lattekafe.designpattern.abstractfactory.samcheoli.SamcheoliFactory;

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
