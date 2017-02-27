package com.lattekafe.designpattern.factorymethod.framework;

public abstract class ItemCreator {
	
	//팩토리 메소드 -> 템플릿 메소드 패턴과 유사
	public Item create(){
		
		Item item;
		
		requestItemsInfo();
		item = createItem();
		createItemLog();
		
		return item;
	}
	
	//아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청한다
	protected abstract void requestItemsInfo();
	
	//아이템을 생성한 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성 정보를 남긴다.
	protected abstract void createItemLog();
	
	//아이템을 생성하는 알고리즘
	protected abstract Item createItem();

}
