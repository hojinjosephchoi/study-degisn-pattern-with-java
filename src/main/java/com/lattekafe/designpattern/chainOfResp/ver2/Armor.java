package com.lattekafe.designpattern.chainOfResp.ver2;

public abstract class Armor implements Defense {
	
	private Defense nextDefense;

	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}

	@Override
	public void defense(Attack attack) {
		
		process(attack);
		
		if(nextDefense != null){
			nextDefense.defense(attack);
		}
		
	}
	
	protected abstract void process(Attack attack);

}
