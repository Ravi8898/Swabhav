package com.techlabs.composite.pattern.test;

import com.techlabs.composite.pattern.File;
import com.techlabs.composite.pattern.Folder;

public class CompositePatternTest {

	public static void main(String[] args) {
		
		Folder root=new Folder("Movies");
		
		root.addChild(new Folder("comedy"));
//		root.addChild(root.addChild(new File("def", 450, ".avi")));
		
	}

}
