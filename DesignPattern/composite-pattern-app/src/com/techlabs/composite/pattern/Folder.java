package com.techlabs.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem{

	private String name;
	private List<IStorageItem> children=new ArrayList<IStorageItem>();
	
	public Folder(String name) {
		this.name=name;
	}
	
	public List addChild(IStorageItem item) {
		children.add(item);
		return children;
	}
	
	@Override
	public void display() {
		
		System.out.println(this.name);
	}

}
