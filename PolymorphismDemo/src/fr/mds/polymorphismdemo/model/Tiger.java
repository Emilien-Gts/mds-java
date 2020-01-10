package fr.mds.polymorphismdemo.model;

public class Tiger extends CatLike{
	public Tiger(String name) {
		super(name);
	}
	
	public void eatPeople() {
		System.out.println("Eating People");
	}
}
