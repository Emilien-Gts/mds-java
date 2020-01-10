package fr.mds.authorandbooklab.launcher;

import fr.mds.authorandbooklab.model.Author;
import fr.mds.authorandbooklab.model.Book;

public class Launcher {
	public static void main(String[] args) {
		Author didier = new Author("Didier", "didier@gmail.com", 'm');
		Book javaForDummy = new Book("Java for dummy", didier, 19.95, 1000);
		// Use an anonymous instance of Author
		Book laVieDeDidier = new Book("laVieDeDidier", didier, 29.95, 888);
		
		System.out.println(didier.toString());
		System.out.println(javaForDummy.toString());
		System.out.println(laVieDeDidier.toString());
	}
}
