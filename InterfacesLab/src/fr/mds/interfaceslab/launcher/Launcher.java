package fr.mds.interfaceslab.launcher;

import fr.mds.interfaceslab.model.Movable;
import fr.mds.interfaceslab.model.MovableCircle;
import fr.mds.interfaceslab.model.MovablePoint;

public class Launcher {

	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 6, 10, 4);
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);

		Movable m2 = new MovableCircle(2, 1, 2, 4, 20);
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);

	}

}
