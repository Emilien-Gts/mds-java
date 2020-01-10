package fr.mds.guesslumberlab;

import java.util.Random;
import java.util.Scanner;

public class Laucher {
	public static void main(String[] args) {
		/*
		 * Pour éviter de gagner automatiquement si le random vaut 0 de base
		 */
		int choice = -1;
        
        Random rnd = new Random();
        int result = rnd.nextInt(100);
 
        System.out.println("Hello, please guesse your number");
        Scanner sc = new Scanner(System.in);
 
        while ((choice < result) || (choice > result))
        {
        	System.out.print("Your number : ");
            choice = sc.nextInt();
            if (choice < result)
                System.out.println("higher");
 
            if (choice > result)
                System.out.println("lower");
 
        }
 
        System.out.println("This is it, you won !");
    }        
}
