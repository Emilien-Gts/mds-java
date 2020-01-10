package fr.mds.multiplicationtablelab;

import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) {
	   int number = 0;
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Choose ur number : ");
	   number = sc.nextInt();
	   
	   System.out.println("Table de multiplcation jusque : "+number);
	   
	   System.out.print("* | ");
	   for(int i=1; i<(number+1); i++) {
		   System.out.print(i+" | ");
	   }
	   System.out.println("");
	   
	   for(int i = 1; i < 10+1; i++) {
		   	System.out.print(i+" | ");
			for(int j = 1; j < (number+1); j++) {
				System.out.print(i*j + " | ");
			}
			System.out.println("");
		}
	}
}
