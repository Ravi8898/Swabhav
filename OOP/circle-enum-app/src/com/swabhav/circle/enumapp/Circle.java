package com.swabhav.circle.enumapp;

public class Circle {
	
	private float radius;
	private ColorCategory color=ColorCategory.RED;
	private BorderCategory border=BorderCategory.SINGLE;
	float perim;
	
	public void setRadius(float radius) {
		this.radius=radius;
		perim=(float) (2*(Math.PI)*radius);
	}
	
	public ColorCategory getColor() {
		return color;
	}
	
	public void circleSet(float radius, ColorCategory color, BorderCategory border) {
		
		setRadius(radius);
		setColor(color);
		setBorder(border);
	}
	public void setColor(ColorCategory color) {
		this.color = color;
	}

	public BorderCategory getBorder() {
		return border;
	}

	public void setBorder(BorderCategory border) {
		this.border = border;
	}

	public float getRadius() {
		return radius;
	}
	
	public float calculateArea() {
		return perim*radius;	
	}
	
	public float calculatePerimeter() {
		return perim;
	}
}