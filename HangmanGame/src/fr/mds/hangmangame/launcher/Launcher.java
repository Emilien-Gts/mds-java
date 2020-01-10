package fr.mds.hangmangame.launcher;

import java.util.Scanner;
import java.util.Arrays; 

public class Launcher {	
	public static void main(String[] args) {
		//Menu
		System.out.println("**********************");
		System.out.println("** 1 - Solo Player  **");
		System.out.println("** 2 - Multi Player **");
		System.out.println("**********************");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		System.out.print("What is your choice :");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Single Player Mode");
			singlePlayer();
			break;
			
		case 2:
			System.out.println("Multiplayer Mode");
			multiPlayer();
			break;
			
		default:
			break;
		}
	}
	
	public static void play(boolean flag, boolean flag2, int hp, char[] wordSplitCache, char[] wordSplit, char letter, Scanner sc) {
		while(flag) {
			displayHP(hp);
			displayWord(wordSplitCache);
			System.out.print("Give me one letter :");
			letter = sc.next().charAt(0);
			
			//See if letter is on the word
			for (int i = 0; i < wordSplit.length; i++) {
				if( letter == wordSplit[i]) {
					wordSplitCache[i] = letter;
					flag2 = true;
				}
			}
			
			//Increment hp hangman
			if(flag2 == false) {
				hp++;
			}
			
			//Loose
			if(hp == 9) {
				displayHP(hp);
				System.out.println("You loose");
				flag = false;
			}
			
			//Win
			if( Arrays.equals(wordSplit, wordSplitCache)) {
				displayWord(wordSplitCache);
				System.out.println("\nYou win");
				flag = false;
			}
			
			//Re-init flag2
			flag2 = false;
		}
	}
	
	public static void displayWord(char[] word) {
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}
		System.out.println();
	}
	
	public static void displayHP(int hp) {
		switch (hp) {
		case 1:
			System.out.println("");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println();
			break;
		case 2:
			System.out.println(" _________");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println();
			break;
		case 3:
			System.out.println(" _________");
			System.out.println("|         |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");	
			System.out.println();
			break;
		case 4:
			System.out.println(" _________");
			System.out.println("|         |");
			System.out.println("|         0");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");	
			System.out.println();
			break;
		case 5:
			System.out.println(" _________");
			System.out.println("|         |");
			System.out.println("|         0");
			System.out.println("|         |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");	
			System.out.println();
			break;
		case 6:
			System.out.println(" _________");
			System.out.println("|         |");
			System.out.println("|         0");
			System.out.println("|        /|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");	
			System.out.println();
			break;
		case 7:
			System.out.println(" _________");
			System.out.println("|         |");
			System.out.println("|         0");
			System.out.println("|        /|\\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");	
			System.out.println();
			break;
		case 8:
			System.out.println(" _________");
			System.out.println("|         |");
			System.out.println("|         0");
			System.out.println("|        /|\\");
			System.out.println("|        /");
			System.out.println("|");
			System.out.println("|");	
			System.out.println();
			break;
		case 9:
			System.out.println(" _________");
			System.out.println("|         |");
			System.out.println("|         0");
			System.out.println("|        /|\\");
			System.out.println("|        / \\");
			System.out.println("|");
			System.out.println("|");	
			System.out.println();
			break;
		default:
			break;
		}
	}
	
	public static void multiPlayer() {
		System.out.println("Let's play !\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name player 1 :");
		String player1 = sc.nextLine();
		System.out.print("What is your name player 2 :");
		String player2 = sc.nextLine();
		
		//First round
		System.out.print("Please " + player2 + ", choose your word :");
		String word = sc.nextLine();
		
		//Flag - while condition
		boolean flag = true;
		//Flag2 - one letter is on the word
		boolean flag2 = false;
		
		//Hangman level
		int hp = 1;
		
		//Word split
		char[] wordSplit = word.toCharArray();
		char[] wordSplitCache = new char[wordSplit.length];
		
		//Fill
		for(int i=0; i<wordSplit.length; i++) {
			wordSplitCache[i] = '_';
		}
		
		char letter = '\0';
		
		System.out.println("It's your turn " + player1 + ", let's play !");
		play(flag, flag2, hp, wordSplitCache, wordSplit, letter, sc);
		
		//Second round
		System.out.print("Please " + player1 + ", choose your word :");
		Scanner sc2 = new Scanner(System.in);
		String word2 = sc2.nextLine();
		
		//Flag - while condition
		flag = true;
		//Flag2 - one letter is on the word
		flag2 = false;
		
		//Hangman level
		hp = 1;
		
		//Word split
		wordSplit = word2.toCharArray();
		wordSplitCache = new char[wordSplit.length];
		
		//Fill
		for(int i=0; i<wordSplit.length; i++) {
			wordSplitCache[i] = '_';
		}
		
		letter = '\0';
		
		System.out.println("It's your turn " + player2 + ", let's play !");
		play(flag, flag2, hp, wordSplitCache, wordSplit, letter, sc);
		
		sc2.close();
		
	}
	
	public static void singlePlayer() {
		System.out.println("Let's play !\n");
		
		String [] words = {"cat","dog","tree","house","mother","children"};
		
		//Flag - while condition
		boolean flag = true;
		//Flag2 - one letter is on the word
		boolean flag2 = false;
		
		//Random
		int rand = (int)(Math.random() * (((words.length-1) - 0) + 1));
		
		//Hangman level
		int hp = 1;
		
		//Choose one word
		String word = words[rand];
		
		//Word split
		char[] wordSplit = word.toCharArray();
		char[] wordSplitCache = new char[wordSplit.length];
		
		//Fill
		for(int i=0; i<wordSplit.length; i++) {
			wordSplitCache[i] = '_';
		}
		
		//Choose one letter for help user
		wordSplitCache[rand] = wordSplit[rand];
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		char letter = '\0';
		
		play(flag, flag2, hp, wordSplitCache, wordSplit, letter, sc);
	}
}
