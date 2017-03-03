package com.lattekafe.designpattern.visitor;

public class VisitorA implements Visitor {

	private int ageSum;
	
	
	
	public VisitorA() {
		ageSum = 0;
	}



	@Override
	public void visit(Visitable element) {
		if(element instanceof VisitableA){
			ageSum += ((VisitableA) element).getAge();
		}

	}



	public int getAgeSum() {
		return ageSum;
	}
	
	

}
