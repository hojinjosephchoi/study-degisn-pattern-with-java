package com.lattekafe.designpattern.chainOfResp.ver1;

public abstract class Calculator {
	
	private Calculator next;
	
	public void setNextCalculator(Calculator next){
		this.next = next;
	}
	
	public boolean process(Request request){
		if(operator(request)){
			return true;
		}else{
			if(next != null){
				return next.process(request);	
			}else{
				return false;
			}
			
		}		
	}
	
	protected abstract boolean operator(Request request);

}
