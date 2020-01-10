package fr.mds.polymorphismdemo.launcher;

import java.util.Random;

import fr.mds.polymorphismdemo.model.Cat;
import fr.mds.polymorphismdemo.model.CatLike;
import fr.mds.polymorphismdemo.model.Tiger;

public class Launcher {

	public static void main(String[] args) {
		CatLike[] myCatlikeArray = new CatLike[50];
		
		Random random = new Random();
		for (int i = 0; i < myCatlikeArray.length; i++) {
			int randomInt = random.nextInt(3);
			
			switch (randomInt) {
			case 0:
				myCatlikeArray[i] = new CatLike("Catlike"+i);
				break;
			case 1:
				myCatlikeArray[i] = new Cat("Cat"+i);
				break;
			case 2:
				myCatlikeArray[i] = new Tiger("Tiger"+i);
				break;

			default:
				System.out.println("randomInt not found" + randomInt);
				break;
			}
		}
		
		for (int i = 0; i < myCatlikeArray.length; i++) {
			myCatlikeArray[i].hunt();
			
			if (myCatlikeArray[i] instanceof Tiger) {
				Tiger tiger = (Tiger) myCatlikeArray[i];
				tiger.eatPeople();
			}
		}
	}

}
