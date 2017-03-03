package com.lattekafe.designpattern.observer.ver1;

import com.lattekafe.designpattern.observer.ver1.Button.OnClickListener;

public class Main {

	public static void main(String[] args) {

		Button btn = new Button();
		btn.setOnClickListener(new OnClickListener() {
			// ConcreteObserver
			@Override
			public void onClick(Button button) {
				System.out.println(button + "is Clicked.");				
			}
		});
		btn.click();

	}

}
 