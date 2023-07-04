package entities;

import entities.enums.Color;

public abstract class Shape { //the class has to be abstract too because of the method
	
	private Color color;
	
	public Shape() {
		
	}
	
	
	public Shape(Color color) { //constructor
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area(); //abstract method
}
