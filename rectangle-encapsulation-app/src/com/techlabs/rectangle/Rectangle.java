package com.techlabs.rectangle;

public class Rectangle {
	
	private int width;
	private int height;
	static final int MIN_RANGE=1;
	static final int MAX_RANGE=100;
	
	public void setWidth(int parWidth) {
		width=getRange(parWidth);
		
	}
	
	public void setHeight(int parHeight) {
		
		height=getRange(parHeight);
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public int getRange(int validParam) {
		if(validParam<MIN_RANGE) {
			validParam=MIN_RANGE;
			}
			
			if(validParam>MAX_RANGE) {
				validParam=MAX_RANGE;
			}
	
			return validParam;
	}
	
	public int calculateArea() {
		
		int area=width*height;
		return area;
	}
}
