package fr.mds.polymorphismlab.launcher;

import fr.mds.polymorphismlab.model.Rectangle;
import fr.mds.polymorphismlab.model.Triangle;
import fr.mds.polymorphismlab.model.Shape;

public class Launcher {
	public static void main(String[] args) {
		Shape s1 = new Rectangle("red", 22, 11);
		Shape s2 = new Triangle("green", 13, 21);
		System.out.println(s1.toString()); 
		System.out.println("Area of shape 1 is " + s1.getArea());
		System.out.println("Area of shape 2 is " + s2.getArea());
	}
}
