package com.lattekafe.designpattern.chainOfResp.ver1;

public class PlusCalculator extends Calculator {

	@Override
	protected boolean operator(Request request) {
		if("+".equals(request.getOperator())){
			int a = request.getA();
			int b = request.getB();
			
			int result = a + b;
			System.out.println(a + " + " + b + " = " + result);
			
			return true;
		}else{
			return false;	
		}
		
		
	}

}
