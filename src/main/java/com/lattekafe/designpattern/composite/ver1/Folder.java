package com.lattekafe.designpattern.composite.ver1;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
	
	public Folder(String name) {
		super(name);
	}

	private List<Component> children = new ArrayList<>();
	
	public boolean addComponent(Component component){
		return children.add(component);
	}
	
	public boolean removeComponent(Component component){
		return children.remove(component);
	}

	public List<Component> getChildren() {
		return children;
	}
	
	

}
