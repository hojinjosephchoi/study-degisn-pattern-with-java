package com.lattekafe.designpattern.abstractfactory.ver2.concrete;

import com.lattekafe.designpattern.abstractfactory.ver2.abst.Button;
import com.lattekafe.designpattern.abstractfactory.ver2.abst.GuiFac;
import com.lattekafe.designpattern.abstractfactory.ver2.abst.TextArea;

public class FactoryInstance {

	public static GuiFac getGuiFac() throws Exception {

		GuiFac factoryInstance = null;

		int osMode = getOsCode();
		
		switch (osMode) {
		case 0:
			factoryInstance = new WinGuiFac();
			break;
		case 1:
			factoryInstance = new MacGuiFac();
			break;

		case 2:
			factoryInstance = new LinuxGuiFac();
			break;

		default:
			throw new Exception("There is no suitable GUI.");
		}

		return factoryInstance;
	}

	private static int getOsCode() {
		String os = System.getProperty("os.name").toLowerCase();
		int result = -1;

		if (os.indexOf("windows") >= 0) {
			result = 0;

		} else if (os.indexOf("mac") >= 0) {
			result = 1;

		} else if (os.indexOf("linux") >= 0) {
			result = 2;
		}

		return result;
	}

}

class LinuxGuiFac implements GuiFac {

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

}

class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("리눅스 버튼 클릭");

	}

}

class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "리눅스 텍스트 에어리어";
	}

}

class MacGuiFac implements GuiFac {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}

}

class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("맥 버튼 클릭");

	}

}

class MacTextArea implements TextArea {

	@Override
	public String getText() {
		return "맥 텍스트 에어리어";
	}

}

class WinGuiFac implements GuiFac {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WinTextArea();
	}

}

class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("윈도우 버튼 클릭");

	}

}

class WinTextArea implements TextArea {

	@Override
	public String getText() {
		return "윈도우 텍스트 에어리어";
	}

}
