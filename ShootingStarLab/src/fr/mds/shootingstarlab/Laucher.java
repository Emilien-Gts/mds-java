package fr.mds.shootingstarlab;

public class Laucher {
	
	public static void main(String[] args) {
		System.out.println("Function 1 - line(5)");
		line(5);
		
		System.out.println("Function 2 - emptySquare(5)");
		emptySquare(5);
		
		System.out.println("Function 3 - square(5)");
		square(5);
		
		System.out.println("Function 4 - triangle(5)");
		triangle(5);
	}
	
	public static void line(int t) {
		String star = "";
		
		for(int i = 0; i <= (t-1); i++) {
			star += "*";
		}
		
		System.out.println(star);
	}
	
	public static void square(int t) {
		for(int i = 0; i < t; i++) {
			System.out.print("*");
			for(int j = 1; j < t-1; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	public static void emptySquare(int t) {
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t; j++) {
                if (i == 1 || i == t) {
                	System.out.print("*");
                }
                else if (j == 1 || j == t) {
                	System.out.print("*");
                }     
                else {
                	System.out.print(" ");
                }   
            }
            System.out.println();
        }
    }
	
	public static void triangle (int t) {
		for(int i = 0; i < t-1; i++) {
			System.out.println("*");
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("*");
		}
		System.out.print("*");
	}
	

}
