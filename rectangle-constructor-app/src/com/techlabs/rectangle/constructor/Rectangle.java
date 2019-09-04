package com.techlabs.rectangle.constructor;

public class Rectangle {
	
	private int width;
	private int height;
	private ColorCategory color=ColorCategory.RED;
	static final int MIN_RANGE=1;
	static final int MAX_RANGE=100;
	
	public Rectangle(int width, int height) {
		
		setWidth(width);
		setHeight(height);
	}
	
	public Rectangle(int width, int height, ColorCategory color) {
		
		setWidth(width);
		setHeight(height);
		setColor(color);
	}
	
	public void setWidth(int parWidth) {
		width=getRange(parWidth);
		
	}
	public ColorCategory getColor() {
		return color;
	}

	public void setColor(ColorCategory color) {
		this.color = color;
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
