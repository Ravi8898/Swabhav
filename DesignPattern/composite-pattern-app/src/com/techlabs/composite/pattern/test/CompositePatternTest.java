package com.techlabs.composite.pattern.test;

import com.techlabs.composite.pattern.File;
import com.techlabs.composite.pattern.Folder;

public class CompositePatternTest {

	public static void main(String[] args) {

		Folder root=new Folder("Movies");
		Folder comedy=new Folder("comedy");
		Folder romance=new Folder("Romance");
		File def=new File("def", 450, ".avi");
		File ravi=new File("ravi", 500, ".mp4");
		File abc=new File("abc", 550, ".avi");
		File pqr=new File("pqr", 650, ".avi");
		File lmno=new File("lmno", 350, ".avi");
		
		comedy.addChild(def);
		comedy.addChild(ravi);
		root.addChild(comedy);
		root.addChild(abc);
		root.addChild(pqr);
		root.addChild(romance);
		romance.addChild(lmno);
//		comedy.removeChild(ravi);
		root.display();
		
	}

}
