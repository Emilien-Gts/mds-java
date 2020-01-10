package fr.mds.enumerationdemo;

public class Laucher {
	
	public static void main(String[] args) {
		System.out.println("Hello MDS");
		
		Promotion myPromo = Promotion.B3;
		System.out.println(myPromo);

		if(myPromo == Promotion.B1) {
			System.out.println("Wecomes noobs !");
		}else {
			System.out.println("Welcome Back");
		}
	}
}
