package com.techlabs.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem {

	private String name;
	List<IStorageItem> children;

	public Folder(String name) {
		children = new ArrayList<IStorageItem>();
		this.name = name;
		
	}

	public void addChild(IStorageItem item) {
		children.add(item);

	}
	
	public void removeChild(IStorageItem item) {
		children.remove(item);

	}

	private static int depth = 0;

	@Override
	public void display() {

		System.out.println("Folder: "+name);
		depth++;
		for (IStorageItem child : children) {
			printDepth(depth);
			child.display();
		}
		depth--;
	}

	private void printDepth(int depth) {

		while (depth != 0) {
			System.out.print("\t");
			depth--;
		}
	}

}
