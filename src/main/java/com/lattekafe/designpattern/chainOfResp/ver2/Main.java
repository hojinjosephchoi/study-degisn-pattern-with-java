package com.lattekafe.designpattern.chainOfResp.ver2;

public class Main {

	public static void main(String[] args) {

		Attack attack = new Attack(100);
		
		Armor armor1 = new Armor() {
			@Override
			protected void process(Attack attack) {
				int amount = attack.getAmount();
				amount *= 0.8;
				attack.setAmount(amount);
				
			}
		};
		
		Armor armor2 = new Armor() {
			@Override
			protected void process(Attack attack) {
				int amount = attack.getAmount();
				amount -= 10;
				if(amount < 0){
					amount = 0;
				}
				attack.setAmount(amount);
				
			}
		};
		
		
		armor1.setNextDefense(armor2);
		
		// 첫번째 공격
		armor1.defense(attack);
		System.out.println(attack.getAmount());
		
		
		// 추가 착용
		armor1.setNextDefense(new Armor() {
			
			@Override
			protected void process(Attack attack) {
				int amount = attack.getAmount();
				attack.setAmount(amount -= 50); 
				
			}
		});
		
//		armor1.setNextDefense((Attack att) -> {
//			int amount = att.getAmount();
//			att.setAmount(amount -= 50); 
//		});
		
		// 두번째 공격
		attack.setAmount(100);
		armor1.defense(attack);
		
		System.out.println(attack.getAmount());

	}

}
