package fr.mds.polymorphismdemo.model;

public class Cat extends CatLike{
	public Cat(String name) {
		super(name);
	}

	@Override
	public void hunt() {
		System.out.println("My cat named " + super.name + " is hunting for fun !");
	}
}
