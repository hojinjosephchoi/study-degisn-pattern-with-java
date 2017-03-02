package com.lattekafe.designpattern.decorator;

import java.util.Scanner;

import com.lattekafe.designpattern.decorator.abst.IBeverage;
import com.lattekafe.designpattern.decorator.concrete.Base;
import com.lattekafe.designpattern.decorator.concrete.Espresso;
import com.lattekafe.designpattern.decorator.concrete.Milk;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		IBeverage beverage = new Base();
		
		boolean done = false;
		
		while(!done){
			System.out.println("음료 현재 가격 : " + beverage.getTotalPrice());
			System.out.print("선택, 1: 샷 추가, 2: 우유 추가");
			
			int mode = sc.nextInt();
			switch(mode){
			case 0:
				done = true;
				break;
			case 1:
				beverage = new Espresso(beverage);
				break;
			case 2:
				beverage = new Milk(beverage);
				break;
				
			}
			
			
		}
		
		System.out.println("최종 음료 가격 : " + beverage.getTotalPrice());
		
		sc.close();

	}

}
