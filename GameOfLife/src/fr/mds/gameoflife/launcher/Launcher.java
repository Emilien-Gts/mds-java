package fr.mds.gameoflife.launcher;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.mds.gameoflife.model.*;

public class Launcher {
	public static void main(String[] args) {
		
		int row = value("row");
		int column = value("colum");
		World world = new World(row, column);
		
		for(int i = 0 ; i < 1000 ; i++) {
			try {
				world.newGeneration();
				System.out.println(world);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}		
	
	public static int value(String value) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int number = 0;
		
		while (flag) {
	        try {
	        	System.out.println("Tell me a number for "+value);
	            number = sc.nextInt();
	            if(number <= 5 || number >=100) {
	            	throw new LimiteException();
	            }  
	            flag = false;    
	        }catch(InputMismatchException e) {
	            System.err.println("A NUMBER");
	            sc.nextLine();
	        }catch(LimiteException e) {
	        	System.err.println("5> x <100");
	        	sc.nextInt();
	        }
		}
		return number;
	}
}
