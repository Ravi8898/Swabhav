package com.swabhav.circle;

public class Circle {
	
	private float radius;
	private String color="RED";
	float perim;
	
	public void setRadius(float radius) {
		this.radius=radius;
		perim=(float) (2*(Math.PI)*radius);
	}
	
	public float getRadius() {
		return radius;
	}
	
	public void setColor(String color) {
		color=convertUpperCase(color);
		if(color.equals("RED") || color.equals("BLUE") || color.equals("GREEN")) {
			this.color=color;
		}
		else {
		this.color="RED";
		}
	}
	
	public String getColor() {
		return color;
	}
	
	public String convertUpperCase(String color) {
		color=color.toUpperCase();
		return color;
	}
	
	public float calculateArea() {
		return perim*radius;	
	}
	
	public float calculatePerimeter() {
		return perim;
	}

}