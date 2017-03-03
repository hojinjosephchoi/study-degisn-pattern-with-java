package com.lattekafe.designpattern.observer.ver3;

import com.lattekafe.designpattern.observer.ver3.Observable.Observer;

public class Main {

	public static void main(String[] args) {
		// Delegate를 사용해서 Observer Pattern 사용하는 방법
		// 1. Generic (Observer에 Generic으로..)
		// 2. Delegate 사용
		// 3. 내부에 Observer를 넣는다.
		
		Button btn = new Button();
		btn.addObserver(new Observer<String>() {
			@Override
			public void update(Observable o, String arg) {
				System.out.println(o + "is clicked.");
				
			}
		});
		
		btn.click();
		btn.click();
		btn.click();

	}

}
