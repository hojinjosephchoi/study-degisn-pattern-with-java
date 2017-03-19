package com.lattekafe.designpattern.composite.ver1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Folder root = new Folder("root");
		Folder home = new Folder("home");
		Folder etc = new Folder("etc");
		Folder hojin = new Folder("hojin");
		Folder music = new Folder("music");
		Folder document = new Folder("document");

		File test = new File("test");
		File track1 = new File("track1");
		File track2 = new File("track2");
		File resume = new File("resume");
		
		
		root.addComponent(home);
		root.addComponent(etc);
		
		etc.addComponent(test);
		
		home.addComponent(hojin);
		hojin.addComponent(music);
		hojin.addComponent(document);
		
		music.addComponent(track1);
		music.addComponent(track2);
		
		document.addComponent(resume);
		
		printComponents(root, null);

	}
	
	@SuppressWarnings("unchecked")
	public static void printComponents(Component component, ArrayList<String> parents){
		
		if(parents == null){
			parents = new ArrayList<>();
		}else{
			parents = (ArrayList<String>) parents.clone();
		}
		
		parents.add(component.getName());
		
		if(component instanceof Folder){
			for(Component children : ((Folder) component).getChildren()){
				printComponents(children, parents);
			}
		}else{
			
			for(String parent : parents){
				System.out.print(parent + " | ");
			}
			
			System.out.println();
		}
		
	}

}
