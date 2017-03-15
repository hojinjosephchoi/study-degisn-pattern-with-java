package com.lattekafe.designpattern.decorator.ver2;

import com.lattekafe.designpattern.decorator.ver2.abst.CarComponent;
import com.lattekafe.designpattern.decorator.ver2.concrete.AirBagDecorator;
import com.lattekafe.designpattern.decorator.ver2.concrete.BasicCar;
import com.lattekafe.designpattern.decorator.ver2.concrete.ESCDecorator;
import com.lattekafe.designpattern.decorator.ver2.concrete.SCCDecorator;

public class Main {

	public static void main(String[] args) {
		
		CarComponent myCar = new BasicCar(20000000);
		System.out.println("Price >> " + myCar.getPrice());
		System.out.println("Info >> " + myCar.getCarinfo());
		
		CarComponent airBagMyCar = new AirBagDecorator(myCar, 500000);
		System.out.println("Price >> " + airBagMyCar.getPrice());
		System.out.println("Info >> " + airBagMyCar.getCarinfo());
		
		CarComponent sccAirBagMyCar = new SCCDecorator(airBagMyCar, 700000);
		System.out.println("Price >> " + sccAirBagMyCar.getPrice());
		System.out.println("Info >> " + sccAirBagMyCar.getCarinfo());
		
		CarComponent escSccAirBagMyCar = new ESCDecorator(sccAirBagMyCar, 1000000);
		System.out.println("Price >> " + escSccAirBagMyCar.getPrice());
		System.out.println("Info >> " + escSccAirBagMyCar.getCarinfo());

	}

}
