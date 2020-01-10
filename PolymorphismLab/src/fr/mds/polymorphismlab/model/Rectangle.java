package fr.mds.polymorphismlab.model;

public class Rectangle extends Shape{
	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		// TODO Auto-generated constructor stub
		super(color);
		this.length = length;
		this.width =  width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle [color="+ super.color +", length=" + length + ", width=" + width + "]";
	}
}
