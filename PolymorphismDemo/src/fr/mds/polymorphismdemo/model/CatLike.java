package fr.mds.polymorphismdemo.model;

public class CatLike {
	public String name;
	
	public CatLike(String name) {
		this.name = name;
	}
	
	public void hunt() {
		System.out.println("My catlike named " + name + " is hunting to eat");
	}
}
