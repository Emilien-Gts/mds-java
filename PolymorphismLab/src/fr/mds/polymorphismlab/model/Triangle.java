package fr.mds.polymorphismlab.model;

public class Triangle extends Shape{
	double base;
	double height;
	
	public Triangle(String color, double base, double height) {
		// TODO Auto-generated constructor stub
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}
	
	
}
