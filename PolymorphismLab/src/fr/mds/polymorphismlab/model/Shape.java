package fr.mds.polymorphismlab.model;

public abstract class Shape {
	String color;
	
	public Shape(String color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	
	public abstract double getArea();
}
